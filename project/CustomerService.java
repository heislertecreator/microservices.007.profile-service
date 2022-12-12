package project;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer save(Customer customer);
    Optional<Customer> findById(int id);
    List<Customer> findAll();
}
