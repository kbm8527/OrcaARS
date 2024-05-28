package kr.co.OrcaARS.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;

import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import jakarta.servlet.DispatcherType;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SpringSecurityConfig {

	
	@Bean
	PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	
	 @Bean
	    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
	        return authenticationConfiguration.getAuthenticationManager();
	    }


    @Bean
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
         	
    	http.csrf((csrfConfig) ->
        csrfConfig.disable()
        		)
    	   
        		
             	.authorizeHttpRequests(request -> request
                .dispatcherTypeMatchers(DispatcherType.FORWARD).permitAll()
                .requestMatchers("/**", "/css/**", "/img/**", "/js/**").permitAll()    // 안넣어주니 css등이 작동 안했음
                .requestMatchers("/member/booking/**").hasRole("USER")
	   		  	
                .anyRequest().authenticated() //어떠한 요청이라도 인증필요
                
                	
                		
                		
                )
                .formLogin(login -> login	// form 방식 로그인 사용
                		   .loginPage("/member/login")	// [A] 커스텀 로그인 페이지 지정
                           .loginProcessingUrl("/index")	// [B] submit 받을 url
                           //.usernameParameter("uid")	// [C] submit할 아이디
                           //.passwordParameter("pass")	// [D] submit할 비밀번호
                           .failureUrl("/member/login")
                           .defaultSuccessUrl("/index", true)

                           .permitAll()
                           
                 )
                .logout(logout -> logout
                		.logoutRequestMatcher(new AntPathRequestMatcher("/member/logout"))
                		.logoutSuccessUrl("/index")
                		.invalidateHttpSession(true)
                		//.permitAll()
                		
                );
                		
                		
                //.logout(withDefaults());	// 로그아웃은 기본설정으로 (/logout으로 인증해제)

        
        
        return http.build();
    }

    
    /*
     * 
     * 	private Customizer<LogoutConfigurer<HttpSecurity>> withDefaults() {
		// TODO Auto-generated method stub
		return null;
	}
    
   
     * 
     * 
     * */
	
   

}
