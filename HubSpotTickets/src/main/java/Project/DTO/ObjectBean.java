package Project.DTO;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObjectBean {
	
	@JsonProperty("objects")
	ArrayList<Objects> objects = new ArrayList<Objects>();
	@JsonProperty("hasMore")
	private boolean hasMore;
	@JsonProperty("offset")
	private String offset;

	public ArrayList<Objects> getObjects() {
		return objects;
	}

	public void setObjects(ArrayList<Objects> objects) {
		this.objects = objects;
	}
	
	public boolean isHasMore() {
		return hasMore;
	}
	public void setHasMore(boolean hasMore) {
		this.hasMore = hasMore;
	}
	public String getOffset() {
		return offset;
	}
	public void setOffset(String offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "ObjectBean [objects=" + objects + ", hasMore=" + hasMore + ", offset=" + offset + "]";
	}
	
	

}
