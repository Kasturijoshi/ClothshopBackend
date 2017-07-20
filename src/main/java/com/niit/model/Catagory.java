package com.niit.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import com.sun.istack.internal.NotNull;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
@Component
@Entity
@Table
public class Catagory {
@Id
@NotNull
int catid;

public int getCatid() {
	return catid;
}

public void setCatid(int catid) {
	this.catid = catid;
}
@Column
@NotNull
@Size(min=2, max=20)
String catname;
public String getCatname() {
	return catname;
}

public void setCatname(String catname) {
	this.catname = catname;
}
@Column
@NotNull
@Size(min=2, max=20)
String catdesc;
public String getCatdesc() {
	return catdesc;
}

public void setCatdesc(String catdesc) {
	this.catdesc = catdesc;
}
}
