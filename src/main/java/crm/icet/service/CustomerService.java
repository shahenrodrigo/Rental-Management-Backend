package crm.icet.service;

import crm.icet.dto.Customer;
import crm.icet.entity.CustomerEntity;

import java.util.List;

public interface CustomerService {

    CustomerEntity addCustomer(Customer customer);

    List<Customer> getAll();

    void deleteCustomerById(Integer id);

    Customer searchCustomerById(Integer id);

    CustomerEntity updateCustomerById(Customer customer);
}
