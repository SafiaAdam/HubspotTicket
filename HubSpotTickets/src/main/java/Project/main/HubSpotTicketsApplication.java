package Project.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Project.DTO.ObjectBean;
import Project.DTO.Objects;
import Project.config.AppConfiguration;

@SpringBootApplication
public class HubSpotTicketsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HubSpotTicketsApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ObjectBean objects = context.getBean(ObjectBean.class);
		System.out.println(objects);
	}

}
