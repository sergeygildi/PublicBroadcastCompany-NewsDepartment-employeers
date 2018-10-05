package com.newsroom.employers.configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//  @Autowired
//  private UserService userService;

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http
            .authorizeRequests()
              .antMatchers( "/").permitAll()
              .anyRequest().authenticated()
              .and()
            .formLogin()
              .loginPage("/login")
              .permitAll()
              .and()
            .logout()
              .permitAll();
  }

//  @Override
//  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//    auth.userDetailsService(userService)
//            .passwordEncoder(NoOpPasswordEncoder.getInstance());
//  }

  @Bean
  @Override
  public UserDetailsService userDetailsService() {
    UserDetails user =
            User.withDefaultPasswordEncoder()
                    .username("ss")
                    .password("ss")
                    .roles("USER")
                    .build();

    return new InMemoryUserDetailsManager(user);
  }

}