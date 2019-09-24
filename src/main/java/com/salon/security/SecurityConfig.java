package com.salon.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;



@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder cutter)
        throws Exception{
        cutter.inMemoryAuthentication()
                .withUser("Masivuye")
                .password(encoder().encode("Mass1"))
                .roles("Manager")
                .and()
                .withUser("Admin")
                .password("Man1")
                .roles("Admin");
    }

    @Override
    protected void configure(HttpSecurity http)
        throws Exception{
        http.authorizeRequests()
                .antMatchers(HttpMethod.POST,"SalonDomain/Warning/**/create/**").hasRole("Admin")
                .anyRequest()
                .authenticated().and()
                .httpBasic()
                .and()
                .csrf()
                .disable()
                .formLogin()
                .disable();

    }
    @Bean
    public PasswordEncoder encoder(){
        final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }
}
