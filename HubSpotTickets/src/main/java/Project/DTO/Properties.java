package Project.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Properties {
	
	@JsonProperty("subject")
	private Subject subject;
	@JsonProperty("content")
	private Content content;
	@JsonProperty("hs_pipeline")
	private Hs_Pipeline hs_pipeline;
	@JsonProperty("hs_pipeline_stage")
	private Hs_Pipeline_Stage hs_pipeline_stage;
	
	
	
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
	public Hs_Pipeline getHs_pipeline() {
		return hs_pipeline;
	}
	public void setHs_pipeline(Hs_Pipeline hs_pipeline) {
		this.hs_pipeline = hs_pipeline;
	}
	public Hs_Pipeline_Stage getHs_pipeline_stage() {
		return hs_pipeline_stage;
	}
	public void setHs_pipeline_stage(Hs_Pipeline_Stage hs_pipeline_stage) {
		this.hs_pipeline_stage = hs_pipeline_stage;
	}
	
	@Override
	public String toString() {
		return "Properties [subject=" + subject + ", content=" + content + ", hs_pipeline=" + hs_pipeline
				+ ", hs_pipeline_stage=" + hs_pipeline_stage + "]";
	}
	
	
	

}
