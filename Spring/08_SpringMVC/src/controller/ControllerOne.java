package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("home")
public class ControllerOne {


    public ControllerOne(){
        System.out.println("controller One init");
    }

    @GetMapping
    public  String testMethod(){
        System.out.println("request received");
        return "index";
    }


    @PostMapping
    public void testMethod1(){
        System.out.println("POST method Success");
    }

    @DeleteMapping
    public void testMethod2(){
        System.out.println("DELETE method success");
    }


}
