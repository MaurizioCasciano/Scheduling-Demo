package com.example.scheduling.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;

@Configuration
@EnableScheduling
@ConditionalOnProperty(prefix = "scheduling", value = "enabled", havingValue = "true", matchIfMissing = false)
public class SchedulingConfiguration {
    @Value("${scheduling.enabled:false}")
    private Boolean schedulingEnabled;

    @PostConstruct
    public void init(){
        System.out.println("Scheduling enabled: " + this.schedulingEnabled);
    }
}
