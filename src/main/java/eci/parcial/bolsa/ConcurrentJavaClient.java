package eci.parcial.bolsa;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class ConcurrentJavaClient {

    public static final String API_URL = ""

    public void getClient(){
        WebClient httpClient = WebClient.create();
        String info = httpClient.get()
                .uri(API_URL)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve() 
                .bodyToMono(String.class)
                .block(); 
    }
    

}
