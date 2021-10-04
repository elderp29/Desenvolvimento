package com.br.desenv.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    public String testDataBaseConnection(){
        System.out.println("Db connection for Dev - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to H2_TEST - Test instance";
    }

    @Profile("prod")
    @Bean
    public String productionDataBaseConnection(){
        System.out.println("Db connection for Production - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_TEST - Test instance";
    }

    @Profile("devyml")
    @Bean
    public String productionYmlDataBaseConnection(){
        System.out.println("Db connection for Production - MYSQL - yml");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to MYSQL_TEST - Test devyml instance";
    }

}
