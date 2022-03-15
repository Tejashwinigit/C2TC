package com.teju.path.hib;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class admin {
	public admin(int adminId, String adminName) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
	}
	
	@Id
private int adminId;
	
private String adminName;
public int getAdminId() {
	return adminId;
}
public void setAdminId(int adminId) {
	this.adminId = adminId;
}
public String getAdminName() {
	return adminName;
}
public void setAdminName(String adminName) {
	this.adminName = adminName;
}
}

