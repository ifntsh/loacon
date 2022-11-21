package group.loacon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class LoaconApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoaconApplication.class, args);
		log.debug("start");
	}

}
