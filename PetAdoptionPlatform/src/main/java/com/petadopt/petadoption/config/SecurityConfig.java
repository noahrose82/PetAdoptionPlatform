package com.petadopt.petadoption.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.petadopt.petadoption.service.UsersBusinessService;



@Configuration
@EnableWebSecurity
@SuppressWarnings("deprecation")
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private UsersBusinessService service;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/", "/user/**").permitAll()
				.anyRequest().authenticated()
				.and()
		.formLogin()
			.loginPage("/login")
			.usernameParameter("username")
			.passwordParameter("password")
			.permitAll()
			.defaultSuccessUrl("/dashboard/loggedin", true)
			.and()
		.logout()
			.logoutUrl("/logout")
			.invalidateHttpSession(true)
			.clearAuthentication(true)
			.permitAll()
			.logoutSuccessUrl("/");
	}
	
	@Autowired
	public void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth
		.userDetailsService(service)
		.passwordEncoder(passwordEncoder);
	}
}
