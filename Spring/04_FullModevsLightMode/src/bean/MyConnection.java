package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {


    public MyConnection() {
        System.out.println("Connection Instantiated");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Connection Bean Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Connection Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Connection Disposable Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Connection Initializing Bean");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Connection Application Context Aware");
    }
}
