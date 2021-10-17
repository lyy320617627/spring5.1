package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.ly"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class Config {

}
