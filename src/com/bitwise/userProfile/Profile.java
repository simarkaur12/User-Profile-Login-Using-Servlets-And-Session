package com.bitwise.userProfile;

public class Profile {
	private String name, pincode, mobile, city, state;
	private int age;
	public Profile(String name, String pincode, String mobile, String city, String state, int age) {
		super();
		this.name = name;
		this.pincode = pincode;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
