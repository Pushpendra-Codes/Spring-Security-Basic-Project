package com.patidar.demo.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity     //go with this config
public class SecurityConfig {

    @Autowired
    private UserDetailsService userDetailsService;


  @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
//        http.csrf(customizer -> customizer.disable());
//        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//        http.formLogin(Customizer.withDefaults());
//        http.httpBasic(Customizer.withDefaults());
//        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));



          return http
                   .csrf(customizer -> customizer.disable())
                   .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                  // .formLogin(Customizer.withDefaults())  //form login for form of  login on browser
                   .httpBasic(Customizer.withDefaults())   //httpBasic for postman
                   .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                   .build();


  //return http.build();
    }


    @Bean
    public AuthenticationProvider authenticationProvider(){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder(10));
       // provider.setUserDetailsService(userDetailsService);


        return provider;

    }

//    @Bean
//    public UserDetailsService userDetailsServicen(){
//
//      UserDetails user1 = User
//              .withDefaultPasswordEncoder()
//              .username("Pushpendra")
//              .password("Practical")
//              .roles("USER")
//              .build();
//
//        UserDetails user2 = User
//                .withDefaultPasswordEncoder()
//                .username("Jay")
//                .password("Patidar")
//                .roles("ADMIN")
//                .build();
//
//
//
//
//        return new InMemoryUserDetailsManager(user1, user2);
//    }
}
