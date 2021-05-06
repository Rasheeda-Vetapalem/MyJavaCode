package com.telusko.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class CollegeAddress {
	@Id
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String clgname,Area,town,city;
	
	private int pincode;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Students> student;
	
	public CollegeAddress(List<Students> student) {
		super();
		this.student = student;
	}
	public CollegeAddress(String clgname, String area, String town, String city, int pincode) {
		super();
		this.clgname = clgname;
		this.Area = area;
		this.town = town;
		this.city = city;
		this.pincode = pincode;
	}
	public String getClgname() {
		return clgname;
	}
	public void setClgname(String clgname) {
		this.clgname = clgname;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public List<Students> getStudent() {
		return student;
	}
	public void setStudent(List<Students> student) {
		this.student = student;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
//	@Override
//	public String toString() {
//		return "CollegeAddress [clgname=" + clgname + ", Area=" + Area + ", town=" + town + ", city=" + city
//				+ ", pincode=" + pincode + "]";
//	}
//	

}
