package com.abhi.ibm.user.vo;

import com.abhi.ibm.user.entity.User;

//We can use this class as return type
public class ResponseTemplateVO {

	private User user;
	private Department department;

	public ResponseTemplateVO() {
		super();
	}

	public ResponseTemplateVO(User user, Department department) {
		super();
		this.user = user;
		this.department = department;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVO [user=" + user + ", department=" + department + "]";
	}

}
