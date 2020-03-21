package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Branch {

	@JsonbProperty(nillable=true)
	private String addressCountry;
	@JsonbProperty(nillable=true)
	private String addressZip;
	@JsonbProperty(nillable=true)
	@JsonbDateFormat(JsonbDateFormat.TIME_IN_MILLIS)
	private Date created;
	//@JsonbProperty(nillable=true)
	@JsonbTransient
	private long latitude;
	@JsonbProperty(nillable=true)
	private String custom;
	@JsonbProperty(nillable=true)
	private String timeZone;
	@JsonbProperty(nillable=true)
	private String addressState;
	@JsonbProperty(nillable=true)
	private String phone;
	@JsonbProperty(nillable=true)
	private String name;
	@JsonbProperty(nillable=true)
	private String addressLine1;
	@JsonbProperty(nillable=true)
	private String addressLine2;
	@JsonbProperty(nillable=true)
	private String fullTimeZone;
	@JsonbProperty(nillable=true)
	@JsonbDateFormat(JsonbDateFormat.TIME_IN_MILLIS)
	private Date updated;
	@JsonbProperty(nillable=true)
	private String publicId;
	@JsonbProperty(nillable=true)
	private String branchPrefix;
	@JsonbProperty(nillable=true)
	private String email;
	@JsonbProperty(nillable=true)
	private String addressCity;
	//@JsonbProperty(nillable=true)
	@JsonbTransient
	private long longitude;
	@JsonbTransient
	//@JsonbProperty(nillable=true)
	//@Valid
	private Map<String, String> additionalProperties = new HashMap<String, String>();

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public long getLatitude() {
		return latitude;
	}

	public void setLatitude(long latitude) {
		this.latitude = latitude;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getFullTimeZone() {
		return fullTimeZone;
	}

	public void setFullTimeZone(String fullTimeZone) {
		this.fullTimeZone = fullTimeZone;
	}

	public Date getUpdated() {
		return updated;
	}

	public void setUpdated(Date updated) {
		this.updated = updated;
	}

	public String getPublicId() {
		return publicId;
	}

	public void setPublicId(String publicId) {
		this.publicId = publicId;
	}

	public String getBranchPrefix() {
		return branchPrefix;
	}

	public void setBranchPrefix(String branchPrefix) {
		this.branchPrefix = branchPrefix;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public long getLongitude() {
		return longitude;
	}

	public void setLongitude(long longitude) {
		this.longitude = longitude;
	}

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("addressCountry", addressCountry).append("addressZip", addressZip).append("created", created).append("latitude", latitude).append("custom", custom).append("timeZone", timeZone).append("addressState", addressState).append("phone", phone).append("name", name).append("addressLine1", addressLine1).append("addressLine2", addressLine2).append("fullTimeZone", fullTimeZone).append("updated", updated).append("publicId", publicId).append("branchPrefix", branchPrefix).append("email", email).append("addressCity", addressCity).append("longitude", longitude).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(addressCountry).append(addressZip).append(created).append(latitude).append(custom).append(timeZone).append(addressState).append(phone).append(name).append(addressLine1).append(addressLine2).append(fullTimeZone).append(additionalProperties).append(updated).append(publicId).append(branchPrefix).append(email).append(addressCity).append(longitude).toHashCode();
	}



}
