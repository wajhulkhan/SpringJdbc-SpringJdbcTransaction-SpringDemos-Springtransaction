package com.org.jdbctransaction.SpringJDBCTransaction;

public interface CustomerDAO {
	
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);

}
