package eci.parcial.bolsa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class BolsaApplication {

	private static final String API_URL = ""

	public static void main(String[] args) {
		WebCliente client = WebClient.create();
		String joke = client.get() 
                .uri(API_URL) 
                .retrieve() 
                .bodyToMono(String.class)
                .block(); 
		SpringApplication.run(BolsaApplication.class, args);

	}

}
