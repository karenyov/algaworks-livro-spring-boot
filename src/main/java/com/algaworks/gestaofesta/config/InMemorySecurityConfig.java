package com.algaworks.gestaofesta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

/**
 * @author Karen
 * 19 de mar de 2018
 */
@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("user").password("{noop}password").roles("USER")
			.and()
			.withUser("joao").password("{noop}123").roles("USER")
			.and()
			.withUser("alexandre").password("{noop}123").roles("USER")
			.and()
			.withUser("thiago").password("{noop}123").roles("USER");
	}

}
