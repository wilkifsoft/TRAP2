package com.trap2.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.trap2.shop.config.PropertiesConfig;

@SpringBootApplication
@EnableWebMvc
public class ShopApplication
{


  public static void main(String[] args)
  {
SpringApplication.run(ShopApplication.class, args);
  //  PropertiesConfig propertiesConfig=ctx.getBean(PropertiesConfig.class);
   // System.out.println(propertiesConfig.getUsername()+" : "+propertiesConfig.getPassword());
  }

}
