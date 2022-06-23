package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringBeanTwo implements InitializingBean {

    @Autowired
    Environment environment;


    @Value("${my_name}")
    private  String name;



    public SpringBeanTwo() {
        System.out.println("spring bean two init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(name);
        System.out.println(environment);
        System.out.println(environment.getProperty("os.name")); // k
        System.out.println(environment.getRequiredProperty("os.name"));

    }
}
