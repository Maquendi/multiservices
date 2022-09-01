package com.userhub.model;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoggedInUser {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String userId;
	
	private String passwordHash;
	
	private String emailAddress;
	
	private List<String> userPermissions;
	
	private boolean isActive;
	
	public boolean isAuthorized(String action) {
	  return this.isActive && userPermissions.contains(action);	
	}


//	public Collection<? extends GrantedAuthority> getAuthorities() {
//		return userPermissions.stream().map(SimpleGrantedAuthority::new).toList();
//	}

	public String getPassword() {
		return passwordHash;
	}

	
	public String getUsername() {
		// TODO Auto-generated method stub
		return emailAddress;
	}


	public boolean isAccountNonExpired() {
		return this.isActive;
	}


	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return isActive;
	}


	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return isActive;
	}


	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return isActive;
	}
}
