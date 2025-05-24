import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaPelicula {

    Pelicula buscaPelicula(int numeroDePelicula){

        URI direccion = URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula + "/");

        HttpClient httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try{
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Pelicula.class);

        } catch (NumberFormatException e){
            System.out.println("Numero no encontrado: " + e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException("No encontre la Pelicula");
        }


    }
}
