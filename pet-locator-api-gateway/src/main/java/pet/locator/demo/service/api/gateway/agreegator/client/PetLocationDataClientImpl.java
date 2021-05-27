package pet.locator.demo.service.api.gateway.agreegator.client;



import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import pet.locator.demo.service.api.gateway.beans.PetAndLocationData;




@Component
public class PetLocationDataClientImpl implements PetLocationDataClient {

	@Override
	public String getPetData() {
		 var request = HttpRequest.newBuilder()
			        .GET()
			        .uri(URI.create("http://localhost:9091/pets/all"))
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
	@Override
	public String getPetDataByPetId(Long petId) {
		
			 var request = HttpRequest.newBuilder()
				        .GET()
				        .uri(URI.create("http://localhost:9091/pet/locations/" + petId))
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

		
	@Override
	public String getPetLocations() {
		 var request = HttpRequest.newBuilder()
			        .GET()
			        .uri(URI.create("http://localhost:9091/pet/locations/all"))
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
	
	
			
	@Override
	public String savePetLocations(PetAndLocationData petData) throws IOException, InterruptedException {
		
		 Gson gson =  new Gson();
		 String petDataBody = gson.toJson(petData.getPetData());
		 
		 var objectMapper = new ObjectMapper();
	        String requestBody = objectMapper.writeValueAsString(petDataBody);

	        
		 
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(URI.create("https://localhost:9091/pets/"))
	                .POST(HttpRequest.BodyPublishers.ofString(requestBody))
	                .build();

	        HttpResponse<String> response = client.send(request,
	                HttpResponse.BodyHandlers.ofString());

	        System.out.println(response.body());
	        
	        return response.body();
	}

	
	
	 
}
