package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class SpringBeanOne implements InitializingBean {

    @Value("${os.name}")
    private String osName;

    @Value("${project_Name}")
    private String projectName;

    @Value("${dataBase_name}")
    private String dbName;


    public SpringBeanOne() {
        System.out.println("spring bean one init");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(osName);
        System.out.println(projectName);
        System.out.println(dbName);





    }
}
