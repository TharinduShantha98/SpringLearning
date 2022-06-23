package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

    @Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("24") int age){

        System.out.println(id);
        System.out.println(age);
        int a =  age;
        System.out.println(a);

        System.out.println("Spring bean Instantiated");
    }

    @Autowired(required = false)
    public SpringBean(@Value("C001") String id, @Value("aluthgama") String address, @Value("24") int age){

        System.out.println(id);
        System.out.println(address);
        System.out.println(age);


        System.out.println("Spring bean Instantiated");
    }
}
