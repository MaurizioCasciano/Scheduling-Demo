package com.example.scheduling.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@Configuration
@Profile("!test")
@EnableScheduling
public class SchedulingConfiguration {

    @PostConstruct
    public void init(){
        System.out.println("Scheduling enabled");
    }
}
