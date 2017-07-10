package com.niit.dao;
import java.util.List;
import com.niit.model.Catagory;
public interface CatDao {
	 public List < Catagory > getAllCatagory();
	 public boolean save(Catagory c);
	 public boolean deleteById(int catid); 
	 public boolean update(Catagory c);
	 public Catagory getById(int catid);
}
