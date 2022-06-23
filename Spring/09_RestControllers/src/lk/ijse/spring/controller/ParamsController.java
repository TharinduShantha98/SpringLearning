package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@RequestMapping("params")
public class ParamsController {


    @GetMapping(params = {"param1","param2"})
    public  String test1(String param1, String param2){
        return  param1 + " " + param2;

    }


    @GetMapping()
    public  String test2(){
        return  "Hello2";
    }

    @GetMapping(params = {"name", "salary" })
    public  String test3(String name ,@RequestParam("salary") double MySalary){
        return  "Hello3  " + name  + " : " + MySalary;
    }


    @GetMapping(path = "one",params = {"name", "salary" })
    public  String test4(String name ,@RequestParam("salary") double MySalary){
        return  "Hello4  " + name  + " : " + MySalary;
    }



}
