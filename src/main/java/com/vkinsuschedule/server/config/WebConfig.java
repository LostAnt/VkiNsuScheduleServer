package com.vkinsuschedule.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Andrew on 04.10.2016.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.vkinsuschedule.server")
public class WebConfig extends WebMvcConfigurerAdapter {
}
