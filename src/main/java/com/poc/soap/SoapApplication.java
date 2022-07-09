package com.poc.soap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@SpringBootApplication
public class SoapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoapApplication.class, args);
	}

/*	@Bean
	CommandLineRunner lookup(CountryEndpoint quoteClient) {
		String  name = "Poland";
		GetCountryRequest gcr = new GetCountryRequest();
		gcr.setName(name);
		GetCountryResponse gcresponse = quoteClient.getCountry(gcr);

		log.info(new Cou);


		return args -> {
		};
	}*/

}
