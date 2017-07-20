package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table

public class Customer {
	@Id
	@NotNull
int cusid;
	@Column
String cusname;
	@Column
int pswd;
	@Column
String email;
	@Column
String cusadd;
	@Column
int phnno;
	@Column
String username;
	@Column
String userrole;

public int getCusid() {
	return cusid;
}
public void setCusid(int cusid) {
	this.cusid = cusid;
}
@Column
public String getCusname() {
	return cusname;
}
public void setCusname(String cusname) {
	this.cusname = cusname;
}
@Column
public int getpswd() {
	return pswd;
}
public void setpswd(int pswd) {
	this.pswd = pswd;
}
@Column
public String getemail() {
	return email;
}
public void setemail(String email) {
	this.email = email;
}
@Column
public String getCusadd() {
	return cusadd;
}
public void setCusadd(String cusadd) {
	this.cusadd = cusadd;
}
@Column
public int getphnno() {
	return phnno;
}
public void setphnno(int phnno) {
	this.phnno = phnno;
}
@Column
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Column
public String getUserrole() {
	return userrole;
}
public void setUserrole(String userrole) {
	this.userrole = userrole;
}

}