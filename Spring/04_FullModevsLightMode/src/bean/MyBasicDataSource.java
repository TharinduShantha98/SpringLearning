package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyBasicDataSource   implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {
    MyConnection connection;

    public MyBasicDataSource() {
        System.out.println("MyBasicDataSource Instantiated");
    }
    public void setMyConnection(MyConnection connection) {
        this.connection = connection;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyBasicDataSource Bean Name Aware");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyBasicDataSource Bean Factory Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyBasicDataSource Application Context Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBasicDataSource Initializing Bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("MyBasicDataSource Disposable Bean");
    }
}
