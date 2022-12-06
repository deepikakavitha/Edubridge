package com.edubridge.fooddeliveryproject.model;

//import java.util.List;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
//import javax.validation.constraints.Size;
import javax.validation.constraints.Size;

//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="User_Table")
public class User {
	@Id
	
	@Column(name="email_id",unique=true)
	@NotEmpty
	@Email(message="Email  is not valid!")
	public String emailID;
	
	@Column(name = "first_Name")
	@NotEmpty
	@Size(min=3, message = "FirstName must contain atleat 3 characters")
	private String firstName;
	
	@Column(name = "last_Name")
	@NotEmpty
	@Size(min=3, message = "LastName must contain atleast 3 characters")
	private String lastName;
	
	@Column(name = "Password")
	@NotEmpty
	@Size(min=8, message="INVALID PASSWORD!!...Password length must be 8 and contain uppercase,lowercase,digits")
	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
  public String password;
	
	@Column(name="district")
	@NotEmpty
	@Size(min=3 , message="district must contain atleast 3 characters")
  private String district;
	
	@Column(name="state")
	@NotEmpty
	@Size(min=3 , message="state must contain atleast 3 characters")
  private String state;
	
	@Column(name="zip_code")
	@NotEmpty
	@Size(min=6 ,max=6, message="zipCode must contain 6 digits")
	private String zipCode;
	
	@Column(name="mobile_No")
	@NotEmpty
	@Size(min=10, max=10, message="INVALID MOBILE NUMBER!!... The number must contain 10 digits")
	private long mobile_No;
	
	@Column(name="Role")
	private String role;
	
	@Column(name="Street")
	private String street;

	
/*	@OneToMany(mappedBy="User", cascade=CascadeType.MERGE)
	@JsonIgnore
	private List<Category>booking;
	
  @OneToOne(mappedBy="customer", cascade=CascadeType.MERGE)
  @JsonIgnore
	private List<Cart>payement;  */
  
  public User()
  {
  	
  }



public User(String emailID, String firstName, String lastName,
		@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}") String password, String district, String state,
		String zipCode, long mobile_No, String role, String street) {
	super();
	this.emailID = emailID;
	this.firstName = firstName;
	this.lastName = lastName;
	this.password = password;
	this.district = district;
	this.state = state;
	this.zipCode = zipCode;
	this.mobile_No = mobile_No;
	this.role = role;
	this.street = street;
}


public String getRole() {
	return role;
}



public void setRole(String role) {
	this.role = role;
}



public String getStreet() {
	return street;
}



public void setStreet(String street) {
	this.street = street;
}



public String getEmailID() {
	return emailID;
}

public void setEmailID(String emailID) {
	this.emailID = emailID;
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

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getDistrict() {
	return district;
}

public void setDistrict(String district) {
	this.district = district;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getZipCode() {
	return zipCode;
}

public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}

public long getMobile_No() {
	return mobile_No;
}

public void setMobile_No(long mobile_No) {
	this.mobile_No = mobile_No;
}
}




  
