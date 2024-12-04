package crm.icet.controller;

import crm.icet.dto.Customer;
import crm.icet.entity.CustomerEntity;
import crm.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequiredArgsConstructor
@RestController
@CrossOrigin
@RequestMapping("/customer")

public class CustomerController {

    final CustomerService customerServiceImpl;

    @PostMapping("/add-customer")

    public CustomerEntity addCustomer(@RequestBody Customer customer){
        return customerServiceImpl.addCustomer(customer);
    }

    @GetMapping("/get-all")

    public List<Customer> getAllCustomer(){
        return customerServiceImpl.getAll();
    }

    @GetMapping("/search-by-id/{id}")

    public Customer getCustomerById(@PathVariable Integer id){
        return customerServiceImpl.searchCustomerById(id);
    }

    @PutMapping("/update-customer")
    public CustomerEntity updateCustomerById(@RequestBody Customer customer){

        return customerServiceImpl.updateCustomerById(customer);
    }



    @DeleteMapping("/delete-by-id/{id}")
    public void deleteCustomerById(@PathVariable Integer id){

        customerServiceImpl.deleteCustomerById(id);
    }

}
