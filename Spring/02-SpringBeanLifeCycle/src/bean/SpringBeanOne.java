package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;




@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean ,DisposableBean{

    public SpringBeanOne() {
        System.out.println("Spring bean one Instantiated");

        //

    }


    @Override
    public void setBeanName(String name) {
        System.out.println("bean name awareness called ");

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("bean factory awareness called");
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("application context awareness called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initialize bean called and bean is ready");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("Spring Bean One destroy");

    }
}
