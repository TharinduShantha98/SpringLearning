package ik.ijse.spring.controller;


import ik.ijse.spring.dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {



  /*  @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto getCustomer(){
        return  new CustomerDto("c-001","tharindu","aluthgama",500000);

    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto searchCustomer(){
        return  new CustomerDto("c-002","tharindu","aluthgama",500000);

    }*/




   /* @GetMapping(consumes = "application/json", produces = "application/json")
    public CustomerDto testCustomer(){
        return new CustomerDto("c-004","tharindu","aluthgama",500000);
    }
*/
  /*  @GetMapping(consumes = "application/json")
    public CustomerDto test2Customer(){
        return new CustomerDto("c-005","tharindu","aluthgama",500000);
    }*/


    @GetMapping
    public ArrayList<CustomerDto> getCustomerAll(){
        ArrayList<CustomerDto> customerDtoArrayList = new ArrayList<>();

        customerDtoArrayList.add(new CustomerDto("coo1","tharindu","aluthgama",500000));
        customerDtoArrayList.add(new CustomerDto("coo2","methmi","rathnapura",500000));
        customerDtoArrayList.add(new CustomerDto("coo3","kamal","colombo",70000));
        customerDtoArrayList.add(new CustomerDto("coo4","lahiru","colombo",60000));
        customerDtoArrayList.add(new CustomerDto("coo5","vimal","colombo",50000));


        return customerDtoArrayList;
    }


}
