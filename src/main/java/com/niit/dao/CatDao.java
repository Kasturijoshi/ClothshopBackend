package com.niit.dao;
import java.util.List;
import com.niit.model.Catagory;
public interface CatDao {
	 public List <Catagory>getAllCatagory();
	 public boolean savecat(Catagory c);
	 public boolean deletecatById(int catid); 
	 public boolean updatecat(Catagory c);
	 public Catagory getcatById(int catid);
}
