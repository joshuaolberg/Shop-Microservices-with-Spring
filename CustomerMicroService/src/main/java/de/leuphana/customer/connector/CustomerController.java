package de.leuphana.customer.connector;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.customer.connector.entity.CustomerEntity;

@ComponentScan
@RestController
public class CustomerController {

	final Customer2CartConnectorRequester customer2CartConnectorRequester;
	final Customer2OrderConnectorRequester customer2OrderConnectorRequester;

	@Autowired
	private CustomerJpaRepository customerJpaRepository;

	@Autowired
	public CustomerController(Customer2CartConnectorRequester customer2CartConnectorRequester,
			Customer2OrderConnectorRequester customer2OrderConnectorRequester) {
		this.customer2CartConnectorRequester = customer2CartConnectorRequester;
		this.customer2OrderConnectorRequester = customer2OrderConnectorRequester;
		
	}

	@GetMapping("/list")
	@ResponseBody
	public List<CustomerEntity> getCustomers() {

		return customerJpaRepository.findAll();
	}

	// Optional, falls kein Customer gefunden wird.
	@RequestMapping("/{customerId}")
	@ResponseBody
	public Optional<CustomerEntity> getCustomer(@PathVariable("customerId") int customerId) {

		return customerJpaRepository.findById(customerId);
	}

	// Client to Server
	// POST über z.B. Postman Client
	@PostMapping("/customer")
	public CustomerEntity addCustomer(@RequestBody CustomerEntity customerEntity) {

		customerJpaRepository.save(customerEntity);

		return customerEntity;
	}

	@DeleteMapping("customer/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {

		CustomerEntity a = customerJpaRepository.getOne(customerId);
		customerJpaRepository.delete(a);

		return "deleted";
	}

	@PutMapping("/customer")
	public CustomerEntity updateCustomer(@RequestBody CustomerEntity customerEntity) {

		customerJpaRepository.save(customerEntity);

		return customerEntity;
	}

	/// CONNECTOR REQUESTER // SERVER TO CLIENT ///

	@GetMapping("/cart")
	public List<?> getCart() {
		return customer2CartConnectorRequester.getCart();
	}

	@GetMapping("/orders")
	public List<?> getOrders() {
		return customer2OrderConnectorRequester.getOrders();
	}

}
