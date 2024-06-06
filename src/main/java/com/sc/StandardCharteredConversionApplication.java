package com.sc;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sc.domain.Ransom;
import com.sc.service.RansomService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class StandardCharteredConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(StandardCharteredConversionApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(RansomService ransomService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Ransom>> typeReference = new TypeReference<List<Ransom>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/sc.json");
			try {
				List<Ransom> ransoms = mapper.readValue(inputStream,typeReference);
				ransomService.save(ransoms);
				System.out.println("Ransom Saved!");
			} catch (IOException e){
				System.out.println("Unable to save Ransom: " + e.getMessage());
			}
	    };
	}
}
