package com.niit.dao;
import java.util.List;
import com.niit.model.Customer;
public interface CusDao {
	public List <Customer>getAllCustomer();
	 public boolean savecus(Customer cs);
	 public boolean deletecusById(int cusid); 
	 public boolean updatecus(Customer cs);
	 public Customer getcusById(int cusid);
}
