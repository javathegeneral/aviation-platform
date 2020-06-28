package com.aviation.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import static com.aviation.constant.AviationPlatformConstants.*;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class},scanBasePackages = BASE_PACKAGE)
@EnableJpaRepositories(basePackages = JPA_REPOSITORY_PACKAGE)
@EntityScan(basePackages = ENTITY_SCAN_PACKAGE)
@EnableTransactionManagement
public class SimpleAviationPlatformApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleAviationPlatformApplication.class, args);
    }
}
