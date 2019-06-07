package Project.DTO;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Versions {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("value")
	private String value;
	@JsonProperty("timestamp")
	private String timestamp;
	@JsonProperty("source")
	private String source;
	@JsonProperty("sourceId")
	private String sourceid;
	@JsonProperty("sourveVid")
	private String sourceVid[];
	
	
	public String[] getSourceVid() {
		return sourceVid;
	}
	public void setSourceVid(String[] sourceVid) {
		this.sourceVid = sourceVid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Versions [name=" + name + ", value=" + value + ", timestamp=" + timestamp + ", source=" + source
				+ ", sourceid=" + sourceid + ", sourceVid=" + Arrays.toString(sourceVid) + "]";
	}
	
	
	
	
	
	
	

}
