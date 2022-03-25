package com.cg.jpastart.entities;

@Entity
public class Student {
	private static final String cascadeType = null;
	private int studentId;
	private String Studentname;
	
	private Address Address;
	
	@OneToOne(cascade=cascadeType)
	@Joincolumn(name="Address_FK")
	public Address getAddress() {
		return Address;
	}
	public void setAddress(Address address) {
		this.Address = address;
	}

	@Id
	@Generatedvalue
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentname() {
		return Studentname;
	}
	public void setStudentname(String studentname) {
		Studentname = studentname;
	}
	
	

}
