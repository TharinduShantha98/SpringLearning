package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Girl1 implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean{
    public Girl1() {
        System.out.println("girl one  instantiated");
    }

    @Override
    public void chat(){
        System.out.println("girl one chatting");

    }



    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl one bean factory awareness called");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl one Spring Bean One destroy");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl one Initialize bean called and bean is ready");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl one application context awareness called");
    }

    @Override
    public void setBeanName(String name){
        System.out.println("Girl one bean name awareness called ");
    }
}
