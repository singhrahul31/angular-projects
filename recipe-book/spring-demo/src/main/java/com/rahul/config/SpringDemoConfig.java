package com.rahul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.rahul")
@EnableAspectJAutoProxy
public class SpringDemoConfig {
    
}
