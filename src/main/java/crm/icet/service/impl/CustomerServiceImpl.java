package crm.icet.service.impl;

import crm.icet.dto.Customer;
import crm.icet.entity.CustomerEntity;
import crm.icet.repository.CustomerRepository;
import crm.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    private final ModelMapper mapper;


    @Override
    public CustomerEntity addCustomer(Customer customer) {
        return repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> customerArrayList = new ArrayList<>();
        repository.findAll().forEach(entity->{
            Customer map = mapper.map(entity, Customer.class);
            customerArrayList.add(map);
        });
        return customerArrayList;
    }

    @Override
    public void deleteCustomerById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public Customer searchCustomerById(Integer id) {
        Optional<CustomerEntity> byId = repository.findById(id);

        return mapper.map(byId, Customer.class);
    }

    @Override
    public CustomerEntity updateCustomerById(Customer customer) {
        CustomerEntity map = mapper.map(customer, CustomerEntity.class);
        return repository.save(map);
    }
}


