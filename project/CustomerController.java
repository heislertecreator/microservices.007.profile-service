package project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/services")
public class CustomerController {
    
    @Autowired
    CustomerService customerService;
    
    @RequestMapping(value = "/customer", method = RequestMethod.POST)
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }
    
    @GetMapping("/customers")
    List<Customer> all() {
        return customerService.findAll();
    }    
    
    @GetMapping("/customer")
    @ResponseBody
    public Optional<Customer> fetchCustomer(@RequestParam(value = "id") String id) {
        System.err.println("Getting id: " + id);
       //return customerService.findById(id);
        return customerService.findById(Integer.parseInt(id));
    }
}
