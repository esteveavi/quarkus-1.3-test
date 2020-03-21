package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.annotation.JsonbDateFormat;
import javax.json.bind.annotation.JsonbProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Service implements Serializable
{

	@JsonbProperty(nillable=true)
	private Integer duration;
	@JsonbProperty(nillable=true)
	private Boolean publicEnabled;
	@JsonbProperty(nillable=true)
	private Integer additionalCustomerDuration;
	@JsonbProperty(nillable=true)
	@JsonbDateFormat(JsonbDateFormat.TIME_IN_MILLIS)
	private Date created;
	@JsonbProperty(nillable=true)
	private String custom;
	@JsonbProperty(nillable=false)
	private String name;
	@JsonbProperty(nillable=true)
	private Boolean active;
	@JsonbProperty(nillable=true)
	@JsonbDateFormat(JsonbDateFormat.TIME_IN_MILLIS)
	private Date updated;
	@JsonbProperty(nillable=false)
	private String publicId;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5101422663066363805L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Service() {
	}



	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Boolean getPublicEnabled() {
		return publicEnabled;
	}

	public void setPublicEnabled(Boolean publicEnabled) {
		this.publicEnabled = publicEnabled;
	}

	public Integer getAdditionalCustomerDuration() {
		return additionalCustomerDuration;
	}

	public void setAdditionalCustomerDuration(Integer additionalCustomerDuration) {
		this.additionalCustomerDuration = additionalCustomerDuration;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
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

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
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

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(duration).append(publicEnabled).append(additionalCustomerDuration).append(created).append(custom).append(name).append(active).append(additionalProperties).append(updated).append(publicId).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Service) == false) {
			return false;
		}
		Service rhs = ((Service) other);
		return new EqualsBuilder().append(duration, rhs.duration).append(publicEnabled, rhs.publicEnabled).append(additionalCustomerDuration, rhs.additionalCustomerDuration).append(created, rhs.created).append(custom, rhs.custom).append(name, rhs.name).append(active, rhs.active).append(additionalProperties, rhs.additionalProperties).append(updated, rhs.updated).append(publicId, rhs.publicId).isEquals();
	}

}