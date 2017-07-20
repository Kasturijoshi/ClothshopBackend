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
	 public List< Catagory > getAllCatagory () {
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery("from Catagory "); // HQL is used here
	               // not SQL
	  List <Catagory> catagorylist=query.list();
	  session.close();
	  return catagorylist;
	  }
	 
	 @Override
	 public boolean savecat(Catagory c) {
	  try {
	   Session session = sessionFactory.openSession();
	   Query q= session.createQuery("select max(catid) from Catagory");
	   int maxcatid=(Integer)q.list().get(0);
	   c.setCatid(maxcatid+1);
	   session.save(c);
	   session.flush();
	   session.close();
	  } catch (Exception e) {
	   return false;
	  }

	  return true;
	 }
	 
	 @Override
	 public boolean deletecatById(String catid) {
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
	 public boolean updatecat(Catagory c) {
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
	 public Catagory getcatById(String catid) {

	  Session session = sessionFactory.openSession();
	  Catagory c = (Catagory) session.get(Catagory.class, catid);
	  session.close();
	  return c;
	 }

	 
}
