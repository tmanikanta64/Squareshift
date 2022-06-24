package com.example.consumption;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.model.Distance;
import com.example.model.*;
@Component
public class CallRestService implements CommandLineRunner {
	
	private static void callRestService() {
		
		RestTemplate resttemplate = new RestTemplate();
		Distance dist = resttemplate.getForObject("https://e-commerce-api-recruitment.herokuapp.com/warehouse/distance?postal_code=465535",Distance.class);
		System.out.println("distance " + dist.getDistance_in_kilometers());
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		callRestService();
		
	}

}
