package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("path")
public class PathVariableControllers {


    @GetMapping(path = "{I001:[a-z]{4}}")
    public String test(@PathVariable("I001") String itemCode){
        return  itemCode;
    }


   /* @GetMapping(path = "{I001}/{name}")
    public String test2(@PathVariable("I001") String itemCode, @PathVariable("name") String itemName){
        return  itemCode + " " + itemName;
    }*/


    @GetMapping(path = "{I001}/{name}")
    public String test3(@PathVariable String I001, @PathVariable String name){
        return  I001 + " " + name;
    }

}
