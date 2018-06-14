package com.ks_xlm;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import javax.servlet.FilterRegistration;

@MapperScan("com.ks_xlm.dao")
@SpringBootApplication

public class KsXlmApplication {

	public static void main(String[] args) {
		SpringApplication.run(KsXlmApplication.class, args);
	}
	/**private CorsConfiguration buildConfig(){
		CorsConfiguration corsConfiguration=new CorsConfiguration();
		corsConfiguration.addAllowedOrigin("*");
		corsConfiguration.addAllowedHeader("*");
		corsConfiguration.addAllowedMethod("*");
		return corsConfiguration;
	}
	//@Bean
	public CorsFilter corsFilter(){
		UrlBasedCorsConfigurationSource source=new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**",buildConfig());
		return new CorsFilter();
	}**/
}
