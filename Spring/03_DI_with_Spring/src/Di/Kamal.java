package Di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Kamal implements DI {

   // @Autowired
    GoodKamali goodKamali;


 /*   public Kamal(GoodKamali k) {
        this.goodKamali = k;

        System.out.println("kamal is instantiated");
    }



*/
     public Kamal() {
         System.out.println("kamal is instantiated");
     }


   /* @Autowired
    public  void setGoodKamali(GoodKamali k){
        this.goodKamali = k;


    }*/

    public void chatWithKamali(){
       goodKamali.chat();

    }

    @Autowired
    @Override
    public void inject(GoodKamali k) {
        this.goodKamali = k;
    }
}
