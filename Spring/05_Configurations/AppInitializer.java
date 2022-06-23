import Config.AppConfig;
import Di.Kamal;
import bean.Boy;
import bean.Girl1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);

        ctx.refresh();

        ctx.registerShutdownHook();


       /* Kamal bean = ctx.getBean(Kamal.class);
        bean.chatWithKamali();*/





       /* Boy bean = ctx.getBean(Boy.class);
        bean.chatWithGirl();*/



        /*Boy boy = ctx.getBean(Boy.class);
        Girl girl = ctx.getBean(Girl.class);
        System.out.println(boy);
        System.out.println(girl);

        boy.chatWithGirl();*/










//        ctx.close();



    }
}
