package com.datahub.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = {"com.datahub"})
@EntityScan(basePackages = {"com.datahub.entities"})
@EnableTransactionManagement
@EnableJpaRepositories(
		basePackages = {"com.datahub.repositories"})
public class DataHubSpringConfig {}
