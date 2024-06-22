package spring_web.service;

import java.util.List;
import java.util.stream.Stream;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import spring_web.entity.Customer;
import spring_web.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository cr;

	public List<Customer> getAll() {
		return cr.findAll();

	}

	public Customer saveCustomer(Customer customer) {
		return cr.save(customer);

	}

	public Customer updateCustomer(Customer customer,int id) {
		Customer result = cr.findById(id).get();
		customer.setName(customer.getName());
		customer.setPassword(customer.getPassword());
		cr.save(result);
		return result;
	}
	
	public String deleteCustomer(int id) {
		cr.deleteById(id);
		return "Delete Secess Id";
		
	}

}
