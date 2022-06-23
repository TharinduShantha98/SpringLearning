package lk.ijse.spring.repo;

import lk.ijse.spring.config.JpaConfig;
import lk.ijse.spring.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@WebAppConfiguration
@ContextConfiguration(classes = {JpaConfig.class})
@ExtendWith(SpringExtension.class)
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;


    @Test
    public void saveItem(){
        Item item = new Item("I001","rice",230,210,"1kg",10000);
        Item item2 = new Item("I002","choco",110,100,"200g",1000);
        Item item3 = new Item("I003","tikirimari",120,150,"300g",1000);

        itemRepo.save(item);
        itemRepo.save(item2);
        itemRepo.save(item3);

    }

    @Test
    public void getAllItems(){
        List<Item> all = itemRepo.findAll();

        for (Item i: all
             ) {
            System.out.println(i.toString());
        }

    }

    @Test
    public void  deleteItem(){
        itemRepo.deleteById("I003");


    }


    @Test
    public void updateItem(){
        Item item2 = new Item("I002","mari",110,100,"200g",1000);
        Item save = itemRepo.save(item2);




    }

    @Test
    public void searchItem(){
        Optional<Item> optional = itemRepo.findById("I001");
        boolean present = optional.isPresent();
        System.out.println(present);

        System.out.println(optional.get().toString());

    }


}