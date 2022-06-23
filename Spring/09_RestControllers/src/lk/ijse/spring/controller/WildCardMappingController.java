package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardMappingController {

    @GetMapping("item/*/hello")
    public String test(){
        return "test method invoked in wild";
    }


    @GetMapping("hello/*/*")
    public String test2(){
        return "test2 method invoked in wild";
    }


    @GetMapping("hello/**/test")
    public String test3(){
        return "test3 method invoked in wild";
    }
}
