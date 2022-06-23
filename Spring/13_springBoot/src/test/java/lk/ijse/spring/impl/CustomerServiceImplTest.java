package lk.ijse.spring.impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDto;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CustomerServiceImplTest {

    @Autowired
    CustomerService customerService;

    @Test
    void saveCustomer() {
        // if it is a new customer it should be added to the database

        CustomerDto customerDto = new CustomerDto("c00-005","test1","test2","rest3","test4","test5");
        customerService.saveCustomer(customerDto);


        //if the customer already exists. check if it is throwing the error
        CustomerDto customerDto2 = new CustomerDto("c00-001","test1","test2","rest3","test4","test5");
        assertThrows(RuntimeException.class, ()->{
            customerService.saveCustomer(customerDto2);
        });




    }

    @Test
    void deleteCustomer() {

        customerService.deleteCustomer("C00-001");


        // if not this customer then  throw exception
        assertThrows(RuntimeException.class, ()->{
            customerService.deleteCustomer("C00-005");

        });



    }

    @Test
    void updateCustomer() {
        CustomerDto customerDto1 = new CustomerDto("c00-001","test1","test2","rest3","test4","test5");
        customerService.updateCustomer(customerDto1);


        // if not this customer then  throw exception
        assertThrows(RuntimeException.class, ()->{
            CustomerDto customerDto2 = new CustomerDto("c00-005","test1","test2","rest3","test4","test5");
            customerService.updateCustomer(customerDto2);

        });

    }

    @Test
    void searchCustomer() {

        //customerService.searchCustomer("C00-001");

        assertThrows(RuntimeException.class,()->{
            //customerService.searchCustomer("C00-005");
             assertNotNull(customerService.searchCustomer("C00-005"));
        });



    }

    @Test
    void getAllCustomer() {

        customerService.getAllCustomer();

    }
}