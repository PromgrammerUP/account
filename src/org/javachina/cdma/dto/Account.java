package org.javachina.cdma.dto;

public class Account {
	public Account(){
		super();
	}
	public Account(String number,String name,double money){
		this.phoneNumber = number;
		this.name = name;
		this.money = money;
	}
	
	private String phoneNumber;
	private String name;
	private double money;
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	
}
