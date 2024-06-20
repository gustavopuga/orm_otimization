package com.example.usermanagement.my_app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("java.com.example.usermanagement.my_app.domain")
@EnableJpaRepositories("java.com.example.usermanagement.my_app.repos")
@EnableTransactionManagement
public class DomainConfig {
}
