package br.com.projecteva.projectevaauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class ProjectevaAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectevaAuthServerApplication.class, args);
	}
}
