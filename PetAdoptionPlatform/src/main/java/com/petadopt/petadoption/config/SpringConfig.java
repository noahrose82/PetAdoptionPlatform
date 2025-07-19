/**
 * Spring configuration class for setting up application-level beans and dependencies.
 * This class is typically used to define @Bean methods that return Spring-managed components.
 */
package com.petadopt.petadoption.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
/**
 * Configuration class for the application.
 */
public class SpringConfig {
	@Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
