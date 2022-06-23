package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements InitializingBean {
    //@Autowired
    @Value("30")
    int a;


    public SpringBean2() {
            printA();
    }



    public void printA(){
        System.out.println(a);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("A" + a);
    }
}
