package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CustomerRepo  extends JpaRepository<Customer , String> {


        //query methods

        Customer findCustomerByFirstName(String name);

        List<Customer> findCustomerByAddress(String address);

        Customer findCustomerByFirstNameAndAddress(String fName, String Address);
        //findBy
        //readBy
        //getBy
        //queryBy
        //searchBy
        //streamBy
                        // one entity recode and List
        Customer readCustomerByFirstName(String name);




        // existBy --> boolean
        //countBy --> number(long)

        long countByFirstName(String name);



        Customer findTopByOrderByCustomerIdDesc();


        //deleteBy --> void
        //removeBy -- void

        @Query(value = "select * from Customer", nativeQuery = true)
        List<Customer> getAllCustomer();

        //native sql with params
        //positional params
        @Query(value = "select * from Customer where name=?1 and address=?2",nativeQuery = true)
        Customer searchCustomerFromName(String name,String address);

        //name params
        @Query(value = "select * from Customer where name=:name and address=:address",nativeQuery = true)
        Customer searchCustomerFromNameParams(@Param("name") String name, @Param("address") String address);




}
