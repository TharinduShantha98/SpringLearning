package controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("two")
public class ControllerTwo {



    // mapping method or handler methods

    @GetMapping
    public String  testTwo(){
        return "Customer";
    }



}
