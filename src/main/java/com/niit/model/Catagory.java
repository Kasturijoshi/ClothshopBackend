package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table
public class Catagory {
@Id
String catid;

public String getCatid() {
	return catid;
}

public void setCatid(String catid) {
	this.catid = catid;
}
@Column
String catname;
public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}
@Column
String catdesc;
public String getCatdesc() {
	return catdesc;
}

public void setCatdesc(String catdesc) {
	this.catdesc = catdesc;
}
}
