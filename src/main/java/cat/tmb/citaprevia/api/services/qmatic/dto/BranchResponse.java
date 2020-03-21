
package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class BranchResponse implements Serializable
{
	@JsonbProperty(nillable=true)
	private List<Branch> branchList = null;
	@JsonbTransient
	//@JsonbProperty(nillable=true)
	private Meta meta;
	@JsonbTransient
	//@JsonbProperty(nillable=true)
	private List<Object> notifications = null;
	@JsonbTransient
	//@JsonbProperty(nillable=true)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -1950666636453247549L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public BranchResponse() {
	}

	/**
	 *
	 * @param branchList
	 * @param meta
	 * @param notifications
	 */
	public BranchResponse(List<Branch> branchList, Meta meta, List<Object> notifications) {
		super();
		this.branchList = branchList;
		this.meta = meta;
		this.notifications = notifications;
	}

	public List<Branch> getBranchList() {
		return branchList;
	}

	public void setBranchList(List<Branch> branchList) {
		this.branchList = branchList;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
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
	public String toString() {
		return new ToStringBuilder(this).append("branchList", branchList).append("meta", meta).append("notifications", notifications).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(branchList).append(additionalProperties).append(meta).append(notifications).toHashCode();
	}



}