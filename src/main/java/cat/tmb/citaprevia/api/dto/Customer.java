package cat.tmb.citaprevia.api.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Customer {

	public Customer() {}

	private String code;
	private boolean isTMB;
	@NotEmpty
	@Email
	private String email;
	private String phoneNumber;
	private String firstName;
	private String firstLastName;
	private String secondLastName;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public boolean isTMB() {
		return isTMB;
	}
	public void setTMB(boolean isTMB) {
		this.isTMB = isTMB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstLastName() {
		return firstLastName;
	}
	public void setFirstLastName(String firstLastName) {
		this.firstLastName = firstLastName;
	}
	public String getSecondLastName() {
		return secondLastName;
	}
	public void setSecondLastName(String secondLastName) {
		this.secondLastName = secondLastName;
	}
	

}
