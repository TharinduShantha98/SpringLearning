package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {



    @GetMapping(path = "it/test1")
    public String test(){
        return "invokes test method";
    }


    @GetMapping("test2/i0")
    public String test2(){
        return "invokes test2 method";
    }
}
