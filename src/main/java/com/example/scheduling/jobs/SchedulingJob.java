package com.example.scheduling.jobs;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
public class SchedulingJob {

    @Scheduled(fixedDelay = 1000)
    private void job(){
        System.out.println("Example job");
    }
}
