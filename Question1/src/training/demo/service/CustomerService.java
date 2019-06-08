package training.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.demo.dao.CustomerDao;
import training.demo.model.Customer;

@Service
public class CustomerService
{
	@Autowired
	private CustomerDao customerDao;
/**
 * customer list
 * @return
 */
	public List<Customer> getCustomerList() {
		
		return customerDao.getCustomerList();
	}
/**
 * adding customer
 * @param c
 * @return
 */
	public int addCustomer(Customer c) {
		return customerDao.addCustomer(c);
	}
/**
 * updating customer
 * @param c
 * @return
 */
	public int updateCustomer(Customer c) {
		return customerDao.updateCustomer(c);
	}
/**
 * customer by id
 * @param id
 * @return
 */
	public Customer getCustomerById(Integer id) {
		return customerDao.getCustomerById(id);
	}
}
