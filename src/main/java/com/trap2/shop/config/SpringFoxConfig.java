package com.trap2.shop.config;

//@Configuration
public class SpringFoxConfig {

/*  private ApiInfo apiInfo() {
    return new ApiInfo(
      "My REST API",
      "Some custom description of API.",
      "API TOS",
      "Terms of service",
      new Contact("John Doe", "www.example.com", "myeaddress@company.com"),
      "License of API",
      "API license URL",
      Collections.emptyList());
  }*/

/*  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
      .apiInfo(apiInfo())
      .select()
      .apis(RequestHandlerSelectors.any())
      .paths(PathSelectors.any())
      .build();
  }*/

  /**
   * SwaggerUI information
   */

/*  @Bean
  UiConfiguration uiConfig() {
    return UiConfigurationBuilder.builder()
      .deepLinking(true)
      .displayOperationId(false)
      .defaultModelsExpandDepth(1)
      .defaultModelExpandDepth(1)
      .defaultModelRendering(ModelRendering.EXAMPLE)
      .displayRequestDuration(false)
      .docExpansion(DocExpansion.NONE)
      .filter(false)
      .maxDisplayedTags(null)
      .operationsSorter(OperationsSorter.ALPHA)
      .showExtensions(false)
      .tagsSorter(TagsSorter.ALPHA)
      .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
      .validatorUrl(null)
      .build();
  }*/

/*  @Bean
  public EmailAnnotationPlugin emailPlugin() {
    return new EmailAnnotationPlugin();
  }*/
}
