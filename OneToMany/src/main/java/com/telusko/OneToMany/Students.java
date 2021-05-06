package com.telusko.OneToMany;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
public class Students {
	@Id
	private int stuid;
	private String stuname;
	private String stubranch;
	private int stumarks;
	public Students(int stuid, String stuname, String stubranch, int stumarks) {
		super();
		this.stuid = stuid;
		this.stuname = stuname;
		this.stubranch = stubranch;
		this.stumarks = stumarks;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getStuname() {
		return stuname;
	}
	public void setStuname(String stuname) {
		this.stuname = stuname;
	}
	public String getStubranch() {
		return stubranch;
	}
	public void setStubranch(String stubranch) {
		this.stubranch = stubranch;
	}
	public int getStumarks() {
		return stumarks;
	}
	public void setStumarks(int stumarks) {
		this.stumarks = stumarks;
	}
	@Override
	public String toString() {
		return "Students [stuid=" + stuid + ", stuname=" + stuname + ", stubranch=" + stubranch + ", stumarks="
				+ stumarks + "]";
	}
}
