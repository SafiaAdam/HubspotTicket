package Project.DTO;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Hs_Pipeline_Stage {
	
	@JsonProperty("versions")
	private ArrayList<Versions> versions = new ArrayList();
	
	//Indicates in what stage the ticket is in(eg value = 4 would be closed)
	@JsonProperty("value")
	private String value;
	
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("source")
	private String source;
	@JsonProperty("sourceid")
	private String sourceid;
	
	
	public ArrayList<Versions> getVersions() {
		return versions;
	}
	public void setVersions(ArrayList<Versions> versions) {
		this.versions = versions;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSourceid() {
		return sourceid;
	}
	public void setSourceid(String sourceid) {
		this.sourceid = sourceid;
	}
	
	
	@Override
	public String toString() {
		return "Hs_Pipeline_Stage [versions=" + versions + ", value=" + value + ", timestamp=" + timestamp + ", source="
				+ source + ", sourceid=" + sourceid + "]";
	}
	
	

}
