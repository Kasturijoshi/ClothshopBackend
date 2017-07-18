package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table

public class Product {
	@Id
	@NotNull
int pid;
	@Column
	String pname;
	int catid,supid;
    @Column
double price;
	@Column
double pqty;
	@Column
String pdescriptn;
	@Column
String imgpath;
	@Column
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public int getSupid() {
	return supid;
}
public void setSupid(int supid) {
	this.supid = supid;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public double getPqty() {
	return pqty;
}
public void setPqty(double pqty) {
	this.pqty = pqty;
}
public String getPdescriptn() {
	return pdescriptn;
}
public void setPdescriptn(String pdescriptn) {
	this.pdescriptn = pdescriptn;
}
public String getImgpath() {
	return imgpath;
}
public void setImgpath(String imgpath) {
	this.imgpath = imgpath;
}



}
