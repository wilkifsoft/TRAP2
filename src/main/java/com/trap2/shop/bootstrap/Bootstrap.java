package com.trap2.shop.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.trap2.shop.config.PropertiesConfig;

public class Bootstrap implements CommandLineRunner
{
  private final PropertiesConfig propertiesConfig;

  public Bootstrap(PropertiesConfig propertiesConfig)
  {
    this.propertiesConfig = propertiesConfig;
  }

  @Override
  public void run(String... args) throws Exception
  {
    System.out.println(propertiesConfig.getUsername());
    System.out.println(propertiesConfig.getPassword());
  }
}
