//Program to demonstrate configuration using annotations
package com.tnsif.springAnnotations.application;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
@Configuration
@ComponentScan(basePackages = "com.tnsif.springAnnotations.application")

@ComponentScan({"com.springannotations"})
public class ApplicationConfig {

}
