package com.br.desenv.springbootconfig.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @Value("${app.message}")
    private String appMessage;

    @Value("${JAVA_HOME:NENHUMA}")
    private String dbEnvironmentVariable;


    @GetMapping("/")
    private String getAppMessage(){
        return appMessage;
    }

    @GetMapping("/envVariable")
    private String getEnvironmentVariable(){
        return "A seguinte variavél de ambiente foi passada: " + dbEnvironmentVariable;
    }
}
