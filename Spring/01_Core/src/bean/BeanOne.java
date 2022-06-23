package bean;


import org.springframework.stereotype.Component;

@Component
public class BeanOne {

    public BeanOne() {

        System.out.println("this is bean One");

    }



    public void oneMethod(){
        System.out.println("this is bean One");
    }
}
