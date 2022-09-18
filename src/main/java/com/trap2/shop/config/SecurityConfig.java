package com.trap2.shop.config;

/*@Configuration
@EnableResourceServer
@EnableGlobalMethodSecurity(
        securedEnabled = true,
        jsr250Enabled = true,
        prePostEnabled = true)*/// Allow method annotations like @PreAuthoriz
public class SecurityConfig/*
    extends ResourceServerConfigurerAdapter*/ {

/*	  @Override
	    public void configure(HttpSecurity http) throws Exception {
	        http.sessionManagement()
	            .sessionCreationPolicy(SessionCreationPolicy.NEVER)
	            .and()
	            .authorizeRequests()
				
	            .antMatchers(	        
	            		"/error**",
	            		"/getImage",
						"/getBoutique/**",
						"/getCategories",
                		"/getLogo2/**",
						"/getLogo/**",
                		 "/getAllBoutiquesForm",
                           "/detailsBoutique_",
                           "/getCart",
                          "/getAllBoutiquesByCat",
                          "/getAllBoutiquesByCatForm",
                          "/getAllCatBoutiquesBy",
                          "/detailsBoutiqueByLib"
	            		)
                .permitAll()
	            .anyRequest().authenticated();

	    }*/
	                                                                                  
	  
/*	   @LoadBalanced // Load balance between service instances running at different ports.
	   @Bean // Create a bean for restTemplate to call services
	   public OAuth2RestTemplate loadBalancedOauth2RestTemplate(
	  OAuth2ProtectedResourceDetails resource, OAuth2ClientContext context) {
	  return new OAuth2RestTemplate(resource, context); }

	   @LoadBalanced // Load balance between service instances running at different ports.	
	   @Bean // Create a bean for restTemplate to call services
	   public RestTemplate restTemplate(RestTemplateBuilder builder) {

	       return builder.setConnectTimeout(Duration.ofMillis(300000))
	        .setReadTimeout(Duration.ofMillis(300000)).build();
	   }*/
	 
}




