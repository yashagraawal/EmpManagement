package com.miniproj.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")
                .password("admin")
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(user);
    }

    @Configuration
    public static class WebSecurityConfig {

        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .requestMatchers("/admin/**").hasRole("ADMIN")
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login")
                    .defaultSuccessUrl("/employees", true)
                    .permitAll()
                    .and()
                    .logout()
                    .logoutUrl("/logout") // specify the logout URL
                    .logoutSuccessUrl("/login?logout") // specify the URL to redirect after logout
                    .invalidateHttpSession(true) // invalidate the HttpSession
                    .deleteCookies("JSESSIONID"); // delete the JSESSIONID cookie
        }
    }
}
