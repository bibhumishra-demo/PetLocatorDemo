package pet.locator.demo.service.api.gateway.agreegator.client;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import org.springframework.stereotype.Component;


@Component
public class PetOwnerDataClientImpl implements PetOwnerDataClient {
	
	
	 @Override
	  public String getPetOwners() {
	    var request = HttpRequest.newBuilder()
	        .GET()
	        .uri(URI.create("http://localhost:9090/petowners/all"))
	        .build();
	    var client = HttpClient.newHttpClient();
	    try {
	      var httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
	      return httpResponse.body();
	    } catch (IOException ioe) {
	      System.out.println("IOException Occurred = " + ioe);
	    } catch (InterruptedException ie) {
	    	System.out.println("InterruptedException Occurred = " + ie);
	      Thread.currentThread().interrupt();
	    }
	    return null;
	  }
}
