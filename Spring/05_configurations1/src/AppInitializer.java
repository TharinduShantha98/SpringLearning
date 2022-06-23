
import config.AppConfig;
import config.AppConfig1;
import config.AppConfig2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =  new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);

        ctx.refresh();

        ctx.registerShutdownHook();






    }
}
