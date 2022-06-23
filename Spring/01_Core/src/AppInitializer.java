import bean.*;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to sut down");
            }
        }));






        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();


      /*  SpringBean bean = ctx.getBean(SpringBean.class);
        bean.textBean();


        BeanOne bean1 = ctx.getBean(BeanOne.class);
        bean1.oneMethod();


        BeanTwo bean2 = ctx.getBean(BeanTwo.class);
        bean2.twoMethod();

        BeanThree bean3 = ctx.getBean(BeanThree.class);
        bean2.twoMethod();
*/

        ctx.registerShutdownHook();

       // ctx.close();


       /* Object beanTwo = ctx.getBean("beanTwo");
        System.out.println(beanTwo);*/


        MyConnection bean = ctx.getBean(MyConnection.class);
        System.out.println(bean);

        MyConnection bean2 = (MyConnection) ctx.getBean("getMyConnection");
        System.out.println(bean2);

    }




}
