package bean;


import org.springframework.stereotype.Component;

@Component
public class BeanThree {

    public BeanThree() {
        System.out.println("this is bean three");



    }


    public void threeMethod(){
        System.out.println("this is bean three");
    }
}
