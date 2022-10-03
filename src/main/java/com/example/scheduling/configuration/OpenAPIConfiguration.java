package com.example.scheduling.configuration;

import com.example.scheduling.api.BooksController;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.SpringDocConfigProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Configuration
@RequiredArgsConstructor
public class OpenAPIConfiguration {

    private final SpringDocConfigProperties springDocConfigProperties;

    @PostConstruct
    private void config() {
        List<String> packages = new ArrayList<>();
        packages.add(BooksController.class.getPackageName());

        this.springDocConfigProperties.setPackagesToScan(packages);
    }
}
