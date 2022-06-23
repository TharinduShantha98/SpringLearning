package config;


import bean.BeanFour;
import bean.BeanThree;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {


    @Bean
    public BeanThree getBeanThree(){
        return new BeanThree();

    }


    @Bean
    public BeanFour getBeanFour(){
        return new BeanFour();

    }



}
