package com.frontdesk.appplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true)
public class ServerSecurityConfig extends WebSecurityConfigurerAdapter{

	
	 private final CustomAuthenticationEntryPoint customAuthenticationEntryPoint;

	   
	   private UserDetailsService userDetailsService;
	   

	   public ServerSecurityConfig(UserDetailsService userDetailsService) {
	       this.customAuthenticationEntryPoint = new CustomAuthenticationEntryPoint();
	       this.userDetailsService = userDetailsService;
	   }

	   @Bean
	   public DaoAuthenticationProvider authenticationProvider() {
	       DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
	       provider.setPasswordEncoder(passwordEncoder());
	       provider.setUserDetailsService(new UserDetailsService() {
			
			@Override
			public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
				// TODO Auto-generated method stub
				return null;
			}
		});
	       return provider;
	   }

	   @Bean
	   public PasswordEncoder passwordEncoder() {
	       return new BCryptPasswordEncoder();
	   }

	   @Bean
	   @Override
	   public AuthenticationManager authenticationManagerBean() throws Exception {
	       return super.authenticationManagerBean();
	   }

	   @Override
	   protected void configure(HttpSecurity http) throws Exception {
	       http
	               .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
	               .and()
	               .authorizeRequests()
	               .antMatchers("/api/signin/**").permitAll()
	               .antMatchers("/api/glee/**").hasAnyAuthority("ADMIN", "USER")
	               .antMatchers("/api/users/**").hasAuthority("ADMIN")
	               .antMatchers("/api/**").authenticated()
	               .anyRequest().authenticated()
	               .and().exceptionHandling().authenticationEntryPoint(customAuthenticationEntryPoint).accessDeniedHandler(new CustomAccessDeniedHandler());
	   }
}
