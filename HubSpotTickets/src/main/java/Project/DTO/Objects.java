package Project.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Objects {
	
	@JsonProperty("objectType")
	private String objectType;
	@JsonProperty("portalId")
	private String portalId;
	@JsonProperty("objectId")
	private String objectId;
	@JsonProperty("properties")
	private Properties properties;
	@JsonProperty("version")
	private int version;
	@JsonProperty("isDeleted")
	private boolean isDeleted;
	
	
	
	
	public String getObjectType() {
		return objectType;
	}
	public void setObjectType(String objectType) {
		this.objectType = objectType;
	}
	public String getPortalId() {
		return portalId;
	}
	public void setPortalId(String portalId) {
		this.portalId = portalId;
	}
	public String getObjectId() {
		return objectId;
	}
	public void setObjectId(String objectId) {
		this.objectId = objectId;
	}
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	
	
	@Override
	public String toString() {
		return "Objects [objectType=" + objectType + ", portalId=" + portalId + ", objectId=" + objectId
				+ ", properties=" + properties + ", version=" + version + ", isDeleted=" + isDeleted + "]";
	}
	
	
	

}
