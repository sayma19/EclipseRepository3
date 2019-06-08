package training.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import training.demo.model.Customer;

@Repository
public class CustomerDao 
{
	@Autowired
	JdbcTemplate jdbcTemplate;


/**
 * for displaying all customers
 * @return
 */
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from ctable", new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				Customer c=new Customer();
				c.setCustno(rs.getInt(1));
				c.setBpack(rs.getString(2));
				c.setOpack(rs.getString(3));
				return c;
			}
			
		});
	}


/**
 * for adding customer
 * @param c
 * @return
 */
	public int addCustomer(Customer c) {
		
		return jdbcTemplate.update("insert into ctable values(?,?,?)",new Object[] {c.getCustno(),c.getBpack(),c.getOpack()});
	}


/**
 * for updating customer
 * @param c
 * @return
 */
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update ctable set bpack=?,opack=? where custno=?",new Object[] {c.getBpack(),c.getOpack(),c.getCustno()});
	}


/**
 * customer by id
 * @param id
 * @return
 */
	public Customer getCustomerById(Integer id) {
		return jdbcTemplate.queryForObject("select * from ctable where custno=?",new Object[] {id}, new RowMapper<Customer>() {

			@Override
			public Customer mapRow(ResultSet rs, int arg1) throws SQLException {
				Customer c=new Customer();
				c.setCustno(rs.getInt(1));
				c.setBpack(rs.getString(2));
				c.setOpack(rs.getString(3));
				return c;
			}
		
	});
	}
}


	

