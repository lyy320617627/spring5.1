package com.ly.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //作为配置类，替换xml配置文件
@ComponentScan (basePackages ={"com.ly"})
public class SpringConfig {

}
