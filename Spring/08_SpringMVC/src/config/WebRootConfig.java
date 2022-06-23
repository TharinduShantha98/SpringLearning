package config;


import org.springframework.context.annotation.Configuration;

@Configuration
public class WebRootConfig {
    public WebRootConfig() {
        System.out.println("Web root config");
    }
}
