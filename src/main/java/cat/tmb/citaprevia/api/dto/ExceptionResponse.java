package cat.tmb.citaprevia.api.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Generic error to add to a REST response, can either be used as a root entity, or mixed with
 * another one.
 */
@XmlRootElement
public class ExceptionResponse implements Serializable {

  private static final long serialVersionUID = -2857605206417841964L;

  /** Error code */
  private String code;

  /**
   * Translated descriptions for the given error code. The key is the locale
   */
  private Map<String, String> descriptions = new HashMap<String, String>();

  /**
   * A free-form key-value dictionary of extra info for the client.
   */
  private Map<String, String> errorParameters = new HashMap<String, String>();


  public ExceptionResponse(String code, Map<String, String> descriptions,
      Map<String, String> errorParameters) {
    this.code = code;
    this.descriptions = descriptions;
    this.errorParameters = errorParameters;
  }

  public ExceptionResponse(String code, Map<String, String> errorParameters) {
    this(code, null, errorParameters);
  }

  public ExceptionResponse(String code) {
    this(code, null, null);
  }

  public ExceptionResponse() {
    this(null, null, null);
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }

  public Map<String, String> getErrorParameters() {
    return errorParameters;
  }

  public void setErrorParameters(Map<String, String> parameters) {
    this.errorParameters = parameters;
  }

  public void setErrorParameter(String parameterName, String parameterValue) {
    this.errorParameters.put(parameterName, parameterValue);
  }

  public Object getErrorParameter(String parameterName) {
    return this.errorParameters.get(parameterName);
  }

  public void addDescription(String language, String message) {
    descriptions.put(language, message);
  }

  public Map<String, String> getDescriptions() {
    return descriptions;
  }

  public void setDescriptions(Map<String, String> descriptions) {
    this.descriptions = descriptions;
  }

  @JsonIgnore
  public String getDefaultLocaleDescription() {
    String result = null;
    if (this.descriptions != null) {
      result = this.descriptions.get("ca_ES");
    }
    return result;
  }

  @Override
  public String toString() {
    return "ExceptionResponse [code=" + code + ", descriptions=" + descriptions
        + ", errorParameters=" + errorParameters + "]";
  }

}