package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.APIZipcodeQuery;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class zipcodeQuery {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public APIZipcodeQuery searchAdress(String cep) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create("https://viacep.com.br/ws/" + cep + "/json/")).build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        return gson.fromJson(response.body(), APIZipcodeQuery.class);
    }
}
