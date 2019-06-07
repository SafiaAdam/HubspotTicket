package Project.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.client.RestTemplate;

import Project.DTO.ObjectBean;
import Project.DTO.Objects;

@Configuration
@PropertySource("Data.properties")
public class AppConfiguration {
	
	@Value("${data.url}")
	private String url;
	@Value("${data.apikey}")
	private String apikey;
	@Value("${data.param}")
	private String parameters;
	
	@Bean
	public ObjectBean objects() {
		RestTemplate rest = new RestTemplate();
		ObjectBean objects = rest.getForObject(url+apikey+parameters, ObjectBean.class);
		return objects;
	}

}
