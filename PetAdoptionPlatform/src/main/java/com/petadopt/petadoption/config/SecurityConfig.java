/*package com.petadopt.petadoption.config;

import org.springframework.context.annotation.Bean; // Import required class
import org.springframework.context.annotation.Configuration; // Import required class
import org.springframework.security.config.annotation.web.builders.HttpSecurity; // Import required class
import org.springframework.security.core.userdetails.UserDetailsService; // Import required class
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Import required class
import org.springframework.security.crypto.password.PasswordEncoder; // Import required class
import org.springframework.security.web.SecurityFilterChain; // Import required class
import org.springframework.security.provisioning.InMemoryUserDetailsManager; // Import required class
import org.springframework.security.core.userdetails.User; // Import required class

@Configuration // Annotation
public class SecurityConfig { // Class declaration

    @Bean // Annotation
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/", "/register", "/login", "/h2-console/**").permitAll()
                .anyRequest().authenticated()
            )
            .formLogin(form -> form.loginPage("/login").permitAll())
            .logout(logout -> logout.permitAll())
            .csrf(csrf -> csrf.ignoringRequestMatchers("/h2-console/**"))
            .headers(headers -> headers.frameOptions().disable());

        return http.build();
    }

    @Bean // Annotation
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Placeholder user details service (replace later with real implementation)
    @Bean // Annotation
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager();
    }
}
*/