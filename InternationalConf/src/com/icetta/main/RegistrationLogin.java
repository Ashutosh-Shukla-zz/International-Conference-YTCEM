package com.icetta.main;

public class RegistrationLogin {
	private String firstName;
	private String lastName;
	private String abstractNo;
	private String paperTitle;
	private String instituteName;
	private String address;
	private String city;
	private String country;
	private String email;
	private String password;
	public RegistrationLogin(String firstName, String lastName,
			String abstractNo, String paperTitle, String instituteName,
			String address, String city, String country, String email,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.abstractNo = abstractNo;
		this.paperTitle = paperTitle;
		this.instituteName = instituteName;
		this.address = address;
		this.city = city;
		this.country = country;
		this.email = email;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAbstractNo() {
		return abstractNo;
	}
	public void setAbstractNo(String abstractNo) {
		this.abstractNo = abstractNo;
	}
	public String getPaperTitle() {
		return paperTitle;
	}
	public void setPaperTitle(String paperTitle) {
		this.paperTitle = paperTitle;
	}
	public String getInstituteName() {
		return instituteName;
	}
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	
}
