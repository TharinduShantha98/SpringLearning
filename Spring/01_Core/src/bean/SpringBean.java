package bean;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring bean Object Created");

    }



    public void textBean(){
        System.out.println("Yes ,,, springBean working");
    }
}
