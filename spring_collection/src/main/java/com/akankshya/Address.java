package com.akankshya;

public class Address {
	private String hno, street, city, state, country;
	private long pincode;
	
	public String getHno() {
		return hno;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getCountry() {
		return country;
	}
	public long getPincode() {
		return pincode;
	}
	public Address(String hno, String street, String city, String state, String country, long pincode) {
		System.out.println("Parameterized constructor of Address class is called");
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
