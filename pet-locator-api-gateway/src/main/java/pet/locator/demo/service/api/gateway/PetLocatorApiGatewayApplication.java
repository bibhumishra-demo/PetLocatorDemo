package pet.locator.demo.service.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PetLocatorApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetLocatorApiGatewayApplication.class, args);
	}

}
