package com.edu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.edu")//automatically inject object without bean
public class ApplicationConfig {

}