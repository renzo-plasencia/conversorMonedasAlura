package com.alura.conversorMonedas;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMonedas {
    private String api_key = "TU_API_KEY";
    String base_code;
    String target_code;

    public ConsultarMonedas( String base_code, String target_code ){
        this.base_code = base_code;
        this.target_code = target_code;
    }
    public Exchange convertirDosMonedas(double amount){
        URI url = URI.create("https://v6.exchangerate-api.com/v6/" + api_key + "/pair/" + base_code +"/" + target_code + "/" );

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(url)
                .build();

        try {
            HttpResponse<String> response = null;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Exchange.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontré esa película de Star Wars");
        }
    }

}
