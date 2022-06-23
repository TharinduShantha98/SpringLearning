package bean;

import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
    public BeanTwo() {
        System.out.println("object created Bean two");

    }


    public void twoMethod(){
        System.out.println("this is bean two");
    }
}
