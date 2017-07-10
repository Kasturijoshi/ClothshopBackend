package com.niit.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Catagory;
@Repository("catagoryDAO")

@Transactional
public class CatDaoImpl implements CatDao {
	 @Autowired
	 SessionFactory sessionFactory;
	 @Override
	 public List<Catagory>getAllCatagory () {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Catagory "); // HQL is used here
	               // not SQL
	  List <Catagory> productlist=query.list();
	  session.close();
	  return productlist;
	  }
	 
	 @Override
	 public boolean save(Catagory c) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.save(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }

	  return true;
	 }
	 
	 @Override
	 public boolean deleteById(int catid) {
	  try {
	   Session session = sessionFactory.openSession();
	   Catagory c = (Catagory) session.get(Catagory.class, catid);
	   if (c == null)
	    return false;
	   session.delete(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }

	  return true;
	 }
	 
	 @Override
	 public boolean update(Catagory c) {
	  try {
	   Session session = sessionFactory.openSession();
	   session.update(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }

	  return true;
	 }

	 @Override
	 public Catagory getById(int catid) {

	  Session session = sessionFactory.openSession();
	  Catagory c = (Catagory) session.get(Catagory.class, catid);
	  session.close();
	  return c;
	 }

	 
}
