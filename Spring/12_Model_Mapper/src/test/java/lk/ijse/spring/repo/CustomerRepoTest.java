package lk.ijse.spring.repo;

import lk.ijse.spring.config.JpaConfig;
import lk.ijse.spring.entity.Customer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@WebAppConfiguration
@ContextConfiguration(classes = {JpaConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo;


    @Test
    public void saveCustomer(){
        Customer customer = new Customer("c00-005","test1","test2","rest3","test4","test5");
       // Customer customer1 = new Customer("c002","test6","test7","rest8","test9","test10");
        //Customer customer2 = new Customer("c003","test11","test12","rest13","test14","test15");

        customerRepo.save(customer);
       // customerRepo.save(customer1);
       // customerRepo.save(customer2);

    }

    @Test
    public void getAllCustomers(){
        List<Customer> all = customerRepo.findAll();

        for (Customer c1: all
             ) {

            System.out.println(c1.toString());

        }

    }


    @Test
    public  void searchCustomer(){
        Optional<Customer> optional = customerRepo.findById("c001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Customer customer = optional.get();
        System.out.println(customer.toString());



    }

    @Test
    public  void deleteCustomer(){
        customerRepo.deleteById("c003");

    }


    @Test
    public void updateCustomer(){
        Customer customer = new Customer("c001","dasun","shanka","rest3","test4","test5");
        customerRepo.save(customer);

    }


    @Test
    public  void searchCustomerByName(){
        Customer methmii = customerRepo.findCustomerByFirstName("methmii");
        System.out.println(methmii.toString());

        Customer customer = customerRepo.readCustomerByFirstName("methmii");
        System.out.println(customer.toString());





    }


    @Test
    public  void searchCustomerByAddress(){
        List<Customer>  customers = customerRepo.findCustomerByAddress("rathnapura");

        for (Customer c: customers
             ) {
            System.out.println(c.toString());

        }



    }


    @Test
    public  void searchCustomerByfNameAndAddress(){
        Customer  customers = customerRepo.findCustomerByFirstNameAndAddress("methmii","rathnapura");
        System.out.println(customers.toString());

    }


    @Test
    public  void countByName(){
        long tharushi = customerRepo.countByFirstName("tharushi");
        System.out.println(tharushi);


    }


    @Test
    public  void lastRow(){
        Customer topByOrderByCustomerIdDesc = customerRepo.findTopByOrderByCustomerIdDesc();
        System.out.println("customer table last row is : "+topByOrderByCustomerIdDesc.toString());


    }
    @Test
    public  void getAllCustomer(){
        List<Customer> allCustomer = customerRepo.getAllCustomer();
        for (Customer c: allCustomer
             ) {
            System.out.println(c.toString());

        }
    }


    @Test
    public  void checkPageableFeatures(){

        PageRequest pr = PageRequest.of(1, 3);
        Page<Customer> all = customerRepo.findAll(pr);
        all.forEach(v->{
            System.out.println(v.toString());

        });



    }

}