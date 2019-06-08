package training.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import training.demo.model.Customer;
import training.demo.service.CustomerService;

@Controller
public class CustomerController 
{
	@Autowired
	private CustomerService customerService;
	/**
	 * for index page
	 * @return
	 */
	@RequestMapping("/")
	public String forIndex()
	{
		return "index";
	}
	/**
	 * for displaying customer list
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView forList()
	{
		List<Customer>clist=customerService.getCustomerList();
		System.out.println(clist);
		return new ModelAndView("customerlist","clist",clist);
	}
	/**
	 * for adding customer
	 * @param model
	 * @return
	 */
	@RequestMapping("/addcustomer")
	public String forAddCustomerPage(ModelMap model)
	{
		model.addAttribute("command",new Customer());
		return "addcustomer";
		
	}
	/**
	 * for adding customer
	 * @param c
	 * @param model
	 * @return
	 */
	@PostMapping("/addcustomer")
	public String forAddCustomerToDB(@ModelAttribute("command")Customer c,ModelMap model)
	{
		customerService.addCustomer(c);
		model.addAttribute("command",c );
		return "addcustomer";
		
	}
	/**
	 * customer get by id
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/customers/{id}")
	public String getCustomerById(@PathVariable("id")Integer id,ModelMap model)
	{
		Customer c= (Customer) customerService.getCustomerById(id);
		model.addAttribute("command",c);
		return "changeorder";
	}
	
	/**
	 * update the details of customer
	 * @param c
	 * @param model
	 * @return
	 */
	@RequestMapping("/changeorder")
	public String updateCustomer(@ModelAttribute("command")Customer c,ModelMap model)
	{
		int i=customerService.updateCustomer(c);
		if(i<=1)
		{
			model.addAttribute("msg","customer updated successfully");
			return "changeorder";
		}
			
		return "changeorder";
		
	}
	
}
