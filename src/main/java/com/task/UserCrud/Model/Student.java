package com.task.UserCrud.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private long rollNo;
	private int age;
	private String address;
	private String gender;
	private long phoneNumber;
	
	
	public Student() {
		super();
	}


	public Student(long id, String name, long rollNo, int age, String address, String gender, long phoneNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public long getRollNo() {
		return rollNo;
	}


	public void setRollNo(long rollNo) {
		this.rollNo = rollNo;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	

}
