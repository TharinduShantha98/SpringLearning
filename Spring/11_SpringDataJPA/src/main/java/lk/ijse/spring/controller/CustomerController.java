package lk.ijse.spring.controller;


import lk.ijse.spring.dto.CustomerDto;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.service.impl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<CustomerDto> getAllCustomer(){
        System.out.println("Hello");

        List<CustomerDto> allCustomer = customerService.getAllCustomer();
        return allCustomer;

    }

    
    @PostMapping
    public void saveCustomer(@ModelAttribute CustomerDto customerDto){
        customerService.saveCustomer(customerDto);

    }


    @DeleteMapping(params = "id")
    public  void deleteCustomer(@RequestParam String id){

        System.out.println(id);
       customerService.deleteCustomer(id);
    }


    @GetMapping(path = "search", params = "id")
    public CustomerDto searchCustomer(@RequestParam String id){
       // System.out.println("this is search part");

        Customer customer = customerService.searchCustomer(id);
       return null;

    }


    @PutMapping
    public void updateCustomer(@RequestBody CustomerDto customerDto){
        System.out.println("customer controller" + customerDto.getCustomerId());
        customerService.updateCustomer(customerDto);

    }




}
