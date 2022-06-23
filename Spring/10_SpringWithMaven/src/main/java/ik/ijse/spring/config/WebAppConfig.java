package ik.ijse.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackages = "ik.ijse.spring" )
@EnableWebMvc

public class WebAppConfig {
}
