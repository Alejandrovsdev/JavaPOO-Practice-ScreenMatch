import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Titulo;
import modelos.TituloOmdb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ApiConsume {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el nombre de la pelicula: ");
        String busqueda = scanner.nextLine(); // almacena la pelicula a buscar

        String url = "http://www.omdbapi.com/?t="+busqueda+"&apikey=c924f56b"; //inserta la pelicula a buscar en la url de la Api

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();


        HttpResponse <String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String jsonBody = response.body();

        //Gson gson = new Gson(); nuevo objeto gson para parsear
        // GsonBuilder para que tomen los nombres de los atributos en minúsculas, debido a que los campos del Json suelen tener la primera letra en mayúsculas interrumpiendo las convenciones de buenas prácticas.
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        // FromJson para pasar de json a clase y ToJson para pasar de clase a json
        Titulo titulo = gson.fromJson(jsonBody, Titulo.class);

        System.out.println(titulo.getNombre() + " " + titulo.getFechaDeLanzamiento());

        TituloOmdb tituloOmdb = gson.fromJson(jsonBody, TituloOmdb.class);
        Titulo otroTitulo = new Titulo(tituloOmdb);

        System.out.println(tituloOmdb.title() + " " + tituloOmdb.year() + " " + tituloOmdb.runtime());


    }
}
