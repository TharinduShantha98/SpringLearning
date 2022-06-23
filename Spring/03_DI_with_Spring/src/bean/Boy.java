package bean;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Boy implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    @Qualifier("girl2")
    @Autowired
    GoodGirl girl;

    public Boy() {
        System.out.println("boy instantiated");
    }


    public  void chatWithGirl(){
        System.out.println(this.girl);

        girl.chat();

    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Boy bean factory awareness called");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Boy Spring Bean One destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Boy Initialize bean called and bean is ready");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Boy application context awareness called");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Boy bean name awareness called ");
    }
}
