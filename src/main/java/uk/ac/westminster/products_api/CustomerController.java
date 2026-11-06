package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {

        Address address = new Address(
                "Main Street",
                "Colombo",
                "02034"
        );


        Customer customer = new Customer(
                id,
                "Senu",
                "senu@gmail.com",
                address
        );

    return customer;
    }
}




