package com.example.scheduling.configuration;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@ConditionalOnProperty(prefix = "scheduling", value = "enabled", havingValue = "true", matchIfMissing = false)
public class SchedulingConfiguration {
}
