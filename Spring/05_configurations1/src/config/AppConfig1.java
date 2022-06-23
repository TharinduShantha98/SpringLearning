package config;

import bean.BeanOne;
import bean.BeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {


    @Bean
    public  BeanOne getBeanOne(){
        return  new BeanOne();
    }



    @Bean
    public BeanTwo getBeanTwo(){
        return  new BeanTwo();
    }
}
