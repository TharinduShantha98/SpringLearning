package lk.ijse.spring.controller;


import org.springframework.web.bind.annotation.*;


@RequestMapping("customer")
@RestController
public class CustomerController {




    @GetMapping// handler mapping
    public String getAllCustomer(){    //handler method
        return  "found all customer";
    }

   // @RequestMapping(value = "test", method = RequestMethod.GET)
    @GetMapping(path = "search")
    public String searchCustomer(){
        return  "search   customer";
    }


    @GetMapping(path = "newId")
    public String getNewId(){
        return  "get New customer id ";
    }






    @PostMapping
    public String SaveCustomer(){
        return  "customer saved and  post method  invoked";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return " customer delete and delete method invoked";
    }


    @PutMapping
    public String updateCustomer(){
        return  "customer updated and update method invoked";
    }

}
