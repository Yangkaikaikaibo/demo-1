package com.accp.pojo;

public class Emp {
	private int eid;
	private String ename;
	private String ework;
	private double esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEwork() {
		return ework;
	}
	public void setEwork(String ework) {
		this.ework = ework;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getEtime() {
		return etime;
	}
	public void setEtime(String etime) {
		this.etime = etime;
	}
	public double getEmoney() {
		return emoney;
	}
	public void setEmoney(double emoney) {
		this.emoney = emoney;
	}
	private String etime;
	private double emoney;
	private int did;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
}
