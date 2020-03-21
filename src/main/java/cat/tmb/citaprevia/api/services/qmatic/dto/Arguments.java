package cat.tmb.citaprevia.api.services.qmatic.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Arguments implements Serializable
{

	@JsonbProperty(nillable=true)
	private Map<String, String> additionalProperties = new HashMap<String, String>();
	private final static long serialVersionUID = -5197669468655650574L;

	public Map<String, String> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, String value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("additionalProperties", additionalProperties).toString();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(additionalProperties).toHashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Arguments) == false) {
			return false;
		}
		Arguments rhs = ((Arguments) other);
		return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).isEquals();
	}

}