package cat.tmb.citaprevia.api.dto;

import java.time.LocalDateTime;

import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Appointment{


	public Appointment() {

	}

	/* Appointment submit request fields */
	
	@NotEmpty
	private String branchId;
	@NotEmpty
	private String serviceId;
	@NotNull
	@Future
	private LocalDateTime appointmentDatetime;
	
	@Valid
	@NotNull
	private Customer customer;
	
	/* Appointment response additional fields */
	private String branchName;
	private String serviceName;
	private String code;
	private Address branchAddress;
	private LocalDateTime creationDatetime;
	private LocalDateTime updatedDatetime;
	private String notes;
	private String customerLanguageISOCode;


	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getBranchId() {
		return branchId;
	}
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public LocalDateTime getAppointmentDatetime() {
		return appointmentDatetime;
	}
	public void setAppointmentDatetime(LocalDateTime appointmentDatetime) {
		this.appointmentDatetime = appointmentDatetime;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getBranchAddress() {
		return branchAddress;
	}
	public void setBranchAddress(Address branchAddress) {
		this.branchAddress = branchAddress;
	}
	public LocalDateTime getCreationDatetime() {
		return creationDatetime;
	}
	public void setCreationDatetime(LocalDateTime creationDatetime) {
		this.creationDatetime = creationDatetime;
	}
	public LocalDateTime getUpdatedDatetime() {
		return updatedDatetime;
	}
	public void setUpdatedDatetime(LocalDateTime updatedDatetime) {
		this.updatedDatetime = updatedDatetime;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String getCustomerLanguageISOCode() {
		return customerLanguageISOCode;
	}
	public void setCustomerLanguageISOCode(String customerLanguageISOCode) {
		this.customerLanguageISOCode = customerLanguageISOCode;
	}
	@Override
	public String toString() {
		return "Appointment [branchId=" + branchId + ", serviceId=" + serviceId + ", appointmentDatetime="
				+ appointmentDatetime + ", customer=" + customer + ", branchName=" + branchName + ", serviceName="
				+ serviceName + ", code=" + code + ", branchAddress=" + branchAddress + ", creationDatetime="
				+ creationDatetime + ", updatedDatetime=" + updatedDatetime + ", notes=" + notes + "]";
	}



}
