package com.userhub.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.userhub.facadeimpl", "com.userhub.serviceimpl", "com.userhub.messaging"})
public class UserHubSpringConfig {}
