package project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    
    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }
    
}
