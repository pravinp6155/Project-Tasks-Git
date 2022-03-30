package com.cjc.main.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Employee {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String uname;
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Address>addr = new  HashSet<Address>();
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Address> getAddr() {
		return addr;
	}
	public void setAddr(Set<Address> addr) {
		this.addr = addr;
	}

	
	
	
	

}
