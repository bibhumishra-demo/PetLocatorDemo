package pet.locator.demo.service.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PetLocatorServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetLocatorServiceRegistryApplication.class, args);
	}

}
