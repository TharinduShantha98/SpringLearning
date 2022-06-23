package bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;


@Component
public class MyConnection  implements DisposableBean {


    public MyConnection() {
        System.out.println("My connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My connection Destroy");

    }
}
