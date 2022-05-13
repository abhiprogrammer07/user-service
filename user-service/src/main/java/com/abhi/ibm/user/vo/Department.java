package com.abhi.ibm.user.vo;

public class Department {

	
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departtmentCode;

	public Department() {
		super();
	}

	public Department(Long departmentId, String departmentName, String departmentAddress, String departtmentCode) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAddress = departmentAddress;
		this.departtmentCode = departtmentCode;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getDepartmentAddress() {
		return departmentAddress;
	}

	public void setDepartmentAddress(String departmentAddress) {
		this.departmentAddress = departmentAddress;
	}

	public String getDeparttmentCode() {
		return departtmentCode;
	}

	public void setDeparttmentCode(String departtmentCode) {
		this.departtmentCode = departtmentCode;
	}

	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName
				+ ", departmentAddress=" + departmentAddress + ", departtmentCode=" + departtmentCode + "]";
	}

}
