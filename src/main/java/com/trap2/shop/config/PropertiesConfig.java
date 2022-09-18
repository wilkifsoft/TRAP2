package com.trap2.shop.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;

@Configuration
@ConfigurationProperties("guru")
@Getter
@Setter
public class PropertiesConfig
{
  private String username;
  private String password;
}
