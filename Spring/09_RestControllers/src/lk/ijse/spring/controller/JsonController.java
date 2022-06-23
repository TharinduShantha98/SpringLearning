package lk.ijse.spring.controller;

import com.sun.jmx.mbeanserver.Repository;
import lk.ijse.spring.Dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JsonController {

    @PostMapping(consumes = "application/json")
    public String getJsonRequest(@RequestBody CustomerDto customerDto){
        return "hello Json " + customerDto.toString() ;
    }

   /* @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CustomerDto> sendBackJson(){
        return ResponseEntity.ok(new CustomerDto("coo1","tharindu","aluthgama",500000));
    }
*/

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto sendBackJson(){
        return new CustomerDto("coo1","tharindu","aluthgama",500000);
    }

    @GetMapping(path = "array", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDto> sendBackJsonArray(){
        ArrayList<CustomerDto> customerDtoArrayList = new ArrayList<>();

        customerDtoArrayList.add(new CustomerDto("coo1","tharindu","aluthgama",500000));
        customerDtoArrayList.add(new CustomerDto("coo2","tharindu","aluthgama",500000));
        customerDtoArrayList.add(new CustomerDto("coo3","tharindu","aluthgama",500000));

        return customerDtoArrayList;


    }







}
