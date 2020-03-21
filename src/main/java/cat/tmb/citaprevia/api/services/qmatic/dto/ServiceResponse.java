
package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ServiceResponse implements Serializable
{

	@JsonbTransient
	private Meta meta;
	@JsonbProperty(nillable=true)
	private List<Service> serviceList = null;
	@JsonbTransient
	private List<Object> notifications = null;
	@JsonbTransient
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = 4322434486792235816L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public ServiceResponse() {
	}

	/**
	 *
	 * @param meta
	 * @param serviceList
	 * @param notifications
	 */
	public ServiceResponse(Meta meta, List<Service> serviceList, List<Object> notifications) {
		super();
		this.meta = meta;
		this.serviceList = serviceList;
		this.notifications = notifications;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public List<Service> getServiceList() {
		return serviceList;
	}

	public void setServiceList(List<Service> serviceList) {
		this.serviceList = serviceList;
	}

	public List<Object> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Object> notifications) {
		this.notifications = notifications;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(serviceList).append(additionalProperties).append(meta).append(notifications).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof ServiceResponse) == false) {
			return false;
		}
		ServiceResponse rhs = ((ServiceResponse) other);
		return new EqualsBuilder().append(serviceList, rhs.serviceList).append(additionalProperties, rhs.additionalProperties).append(meta, rhs.meta).append(notifications, rhs.notifications).isEquals();
	}

}