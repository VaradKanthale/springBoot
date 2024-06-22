package spring_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import spring_web.entity.Customer;
import spring_web.service.CustomerService;

@RestController
@RequestMapping("/Api")
public class CustomerController {

	@Autowired
	private CustomerService service;

	@GetMapping("/GetAll")
	public List<Customer> findAllCustomer() {
		return service.getAll();

	}

	@PostMapping("/SaveAll")
	public Customer saveCustomer(@RequestBody @Valid Customer customer) {
		return service.saveCustomer(customer);

	}

	@PutMapping("{id}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody @Valid Customer customer,@PathVariable("id") int id) {
		return new ResponseEntity<Customer>(service.updateCustomer(customer, id),HttpStatus.OK);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteCustomerId(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Delete Secess Id",HttpStatus.OK);
	}

}
