package Config;


import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {


 /*   @Bean
    public SpringBeanOne getSpringBeanOne(){


        //inter bean dependency
        SpringBeanTwo beanTwo1 = getSpringBeanTwo();
        SpringBeanTwo beanTwo2 = getSpringBeanTwo();

        System.out.println(beanTwo1);
        System.out.println(beanTwo2);

        return  new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getSpringBeanTwo(){
        return new SpringBeanTwo();
    }


*/
}
