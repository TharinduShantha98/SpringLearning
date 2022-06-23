package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("chara")
public class CharactorMappingController {

    //item/I123
    //item/I3e4
    //item/I1qw


    @GetMapping("item/I???")
    public String test(){
        return "test method invoked in char";
    }

    @GetMapping("????/search")
    public String test2(){
        return "test2 method invoked in char";
    }


}
