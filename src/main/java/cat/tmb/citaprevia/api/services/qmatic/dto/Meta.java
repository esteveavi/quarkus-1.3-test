package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Meta implements Serializable
{

	@JsonbProperty(nillable=true)
	private String start;
	@JsonbProperty(nillable=true)
	private String end;
	@JsonbProperty(nillable=true)
	private Integer totalResults;
	@JsonbProperty(nillable=true)
	private Object offset;
	@JsonbProperty(nillable=true)
	private Object limit;
	@JsonbProperty(nillable=true)
	private String fields;
	@JsonbProperty(nillable=true)
	private Arguments arguments;
	@JsonbProperty(nillable=true)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -5440944037192895674L;

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public Meta() {
	}

	/**
	 *
	 * @param totalResults
	 * @param offset
	 * @param start
	 * @param limit
	 * @param end
	 * @param arguments
	 * @param fields
	 */
	public Meta(String start, String end, Integer totalResults, Object offset, Object limit, String fields, Arguments arguments) {
		super();
		this.start = start;
		this.end = end;
		this.totalResults = totalResults;
		this.offset = offset;
		this.limit = limit;
		this.fields = fields;
		this.arguments = arguments;
	}

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}

	public Integer getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(Integer totalResults) {
		this.totalResults = totalResults;
	}

	public Object getOffset() {
		return offset;
	}

	public void setOffset(Object offset) {
		this.offset = offset;
	}

	public Object getLimit() {
		return limit;
	}

	public void setLimit(Object limit) {
		this.limit = limit;
	}

	public String getFields() {
		return fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}

	public Arguments getArguments() {
		return arguments;
	}

	public void setArguments(Arguments arguments) {
		this.arguments = arguments;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("start", start).append("end", end).append("totalResults", totalResults).append("offset", offset).append("limit", limit).append("fields", fields).append("arguments", arguments).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(totalResults).append(offset).append(start).append(limit).append(end).append(arguments).append(additionalProperties).append(fields).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Meta) == false) {
			return false;
		}
		Meta rhs = ((Meta) other);
		return new EqualsBuilder().append(totalResults, rhs.totalResults).append(offset, rhs.offset).append(start, rhs.start).append(limit, rhs.limit).append(end, rhs.end).append(arguments, rhs.arguments).append(additionalProperties, rhs.additionalProperties).append(fields, rhs.fields).isEquals();
	}

}