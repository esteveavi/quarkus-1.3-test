package cat.tmb.citaprevia.api.dto;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

@Schema(name="Branch", description="PuntTMB")
public class Branch {

	public Branch() {}
	
	@Schema(description ="Name of the branch", required = true, example = "PuntTMB Diagonal")
	private String name;
	private String publicId;
	private Address address;
	private String email         ;
    private String phone         ;
    private String timeZone      ;
    private String fullTimeZone  ;
    private String prefix  ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getFullTimeZone() {
		return fullTimeZone;
	}
	public void setFullTimeZone(String fullTimeZone) {
		this.fullTimeZone = fullTimeZone;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	

	
	
	
}
