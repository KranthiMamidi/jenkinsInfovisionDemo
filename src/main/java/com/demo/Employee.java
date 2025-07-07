package com.demo;

public class Employee {

	public void getAddress(int roadNo, String streetName, String city) {
		String address = roadNo + " " + streetName + " " + city;
		System.out.println(address);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.getAddress(1, "ASRR Nagar", "Naspur");
	}
}
