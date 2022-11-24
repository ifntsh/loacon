package group.loacon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Application {

	public static final String APPLICATION_LOCATIONS = "spring.config.location="
			+ "classpath:application.yml,"
			+ "/app/config/springboot-webservice/application.yml";

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		log.debug("main start");
	}

}
