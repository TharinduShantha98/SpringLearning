package config;

import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {
    public AppConfig() {
        System.out.println("App config object created");
    }




    @Bean
    public MyConnection getMyConnection(){
        return new MyConnection();

    }





}
