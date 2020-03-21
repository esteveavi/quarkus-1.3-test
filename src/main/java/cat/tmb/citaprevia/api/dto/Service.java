package cat.tmb.citaprevia.api.dto;

public class Service {

	public Service() {}

	private int duration;
	private boolean publicEnabled;
	private int additionalCustomerDuration;
	private String custom;
	private String name;
	private boolean active;
	private String publicId;
	
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public boolean isPublicEnabled() {
		return publicEnabled;
	}
	public void setPublicEnabled(boolean publicEnabled) {
		this.publicEnabled = publicEnabled;
	}
	public int getAdditionalCustomerDuration() {
		return additionalCustomerDuration;
	}
	public void setAdditionalCustomerDuration(int additionalCustomerDuration) {
		this.additionalCustomerDuration = additionalCustomerDuration;
	}
	public String getCustom() {
		return custom;
	}
	public void setCustom(String custom) {
		this.custom = custom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getPublicId() {
		return publicId;
	}
	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}



}
