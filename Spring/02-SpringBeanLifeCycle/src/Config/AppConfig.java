package Config;


import bean.MyConnection;
import bean.SpringBeanOne;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
