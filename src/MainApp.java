import modelos.Pelicula;
import modelos.Serie;

import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        // Pelicula 1
        Pelicula peli1 = new Pelicula("Titanic",
                                      1997,
                                      true,
                                      120,
                                      "James Cameron");
        // Pelicula 2
        Pelicula peli2 = new Pelicula("The Avengers",
                                      2010,
                                      true,
                                      140,
                                      "Kevin Feigi");
        // Pelicula 3
        Pelicula peli3 = new Pelicula("Mr and Mrs. Smith",
                                      2009,
                                      true,
                                      110,
                                      "Brad Pitt");
        // Pelicula 4
        Pelicula peli4 = new Pelicula("Frozen",
                                      2017,
                                      true,
                                      120,
                                      "John Doe");
        // Serie 1
        Serie serie1 = new Serie("Game of Thrones",
                                 2010,
                                 true,
                                 8,
                                 10,
                                 60);
        //Serie 2
        Serie serie2 = new Serie("Merli",
                                 2017,
                                 true,
                                 3,
                                 10,
                                 55);
        //Serie 3
        Serie serie3 = new Serie("The Walking Dead",
                                 2014,
                                 true,
                                 9,
                                 10,
                                 53);
        //Serie 4
        Serie serie4 = new Serie("Los Simuladores",
                                 2006,
                                 true,
                                 4,
                                 8,
                                 45);

        //lista de películas
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peli1);
        listaDePeliculas.add(peli2);
        listaDePeliculas.add(peli3);
        listaDePeliculas.add(peli4);

        //mostrar el tamaño de la lista
        System.out.println("Nro de películas en la lista: " + listaDePeliculas.size());
        //mostrar la primera y última película
        System.out.println("Primera película de la lista: " + listaDePeliculas.getFirst().getNombre());
        System.out.println("Segunda película de la lista: " + listaDePeliculas.getLast().getNombre());
        //mostrar una película por su índice y obtener sus datos con el get
        System.out.println("Película del index 2: " + listaDePeliculas.get(2).getNombre() + " " + "(" + listaDePeliculas.get(2).getFechaDeLanzamiento() + ")");



    }
}