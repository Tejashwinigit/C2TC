package com.cg.jpastart.entities;

@Entity
public class Address {
private int id;
private String city;
private String district;
private int pincode;
public int getId() {
	return id;
}
@Id
@Generatedvalue
@column(name="AddressId_PK")
public void setId(int id) {
	this.id = id;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDistrict() {
	return district;
}
public void setDistrict(String district) {
	this.district = district;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}


}

