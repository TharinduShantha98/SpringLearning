package Di;

import bean.GoodGirl;
import org.springframework.stereotype.Component;

@Component
public class Kamali  implements GoodKamali {
    public Kamali() {
        System.out.println("kamali is instantiated");

    }

    @Override
    public void chat(){
        System.out.println("chatting");
    }
}
