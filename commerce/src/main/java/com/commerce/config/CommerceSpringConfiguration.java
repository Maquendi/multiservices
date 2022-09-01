package com.commerce.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.datahub.config.DataHubSpringConfig;
import com.userhub.config.UserHubSpringConfig;

@Configuration
@ComponentScan(basePackages = { "com.commerce.facadeimpl", "com.commerce.serviceimpl","com.commerce.messaging" })
@Import(value = { DataHubSpringConfig.class, UserHubSpringConfig.class })
public class CommerceSpringConfiguration {}
