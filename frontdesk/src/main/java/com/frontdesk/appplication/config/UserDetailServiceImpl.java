package com.frontdesk.appplication.config;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.userhub.facade.UserManagementServiceFacade;
import com.userhub.model.LoggedInUser;

@Component
public class UserDetailServiceImpl implements UserDetailsService {

	private UserManagementServiceFacade userFacade;
	
	public UserDetailServiceImpl(UserManagementServiceFacade userFacade) {
		this.userFacade = userFacade;
	}
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		LoggedInUser user = userFacade.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not found"));
		
		return new UserDetails() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isEnabled() {
				// TODO Auto-generated method stub
				return user.isActive();
			}
			
			@Override
			public boolean isCredentialsNonExpired() {
				// TODO Auto-generated method stub
				return user.isCredentialsNonExpired();
			}
			
			@Override
			public boolean isAccountNonLocked() {
				// TODO Auto-generated method stub
				return user.isAccountNonLocked();
			}
			
			@Override
			public boolean isAccountNonExpired() {
				// TODO Auto-generated method stub
				return user.isAccountNonExpired();
			}
			
			@Override
			public String getUsername() {
				// TODO Auto-generated method stub
				return user.getEmailAddress();
			}
			
			@Override
			public String getPassword() {
				// TODO Auto-generated method stub
				return user.getPassword();
			}
			
			@Override
			public Collection<? extends GrantedAuthority> getAuthorities() {
				return user.getUserPermissions().stream().map(SimpleGrantedAuthority::new).toList();
			}
		};
		
	}

}
