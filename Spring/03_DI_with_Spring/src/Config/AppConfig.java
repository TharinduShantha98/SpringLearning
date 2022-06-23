package Config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {


/*
    @Bean
    @Scope("prototype")
    public MyConnection myConnection(){
        return new MyConnection();


    }*/



  /*  @Bean

    public SpringBeanOne getSpringBean(){

        return new SpringBeanOne();
    }*/



}
