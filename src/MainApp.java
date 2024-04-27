import modelos.Pelicula;
import modelos.Serie;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainApp {
    public static void main(String[] args) {
        // Pelicula 1
        Pelicula peli1 = new Pelicula("Titanic",
                                      1997,
                                      true,
                                      120,
                                      "James Cameron");
        peli1.evalua(10);
        peli1.evalua(9);
        peli1.evalua(10);
        peli1.evalua(8.5);
        // Pelicula 2
        Pelicula peli2 = new Pelicula("The Avengers",
                                      2010,
                                      true,
                                      140,
                                      "Kevin Feigi");
        peli2.evalua(8.5);
        peli2.evalua(9);
        peli2.evalua(7.5);
        // Pelicula 3
        Pelicula peli3 = new Pelicula("Mr and Mrs. Smith",
                                      2009,
                                      true,
                                      110,
                                      "Brad Pitt");
        peli3.evalua(7.5);
        peli3.evalua(6.5);
        peli3.evalua(7);
        peli3.evalua(6.5);
        // Pelicula 4
        Pelicula peli4 = new Pelicula("Frozen",
                                      2017,
                                      true,
                                      120,
                                      "John Doe");
        peli4.evalua(8);
        peli4.evalua(9);
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
        System.out.println("Película del index 2: " + listaDePeliculas.get(2).getNombre() + " " + "(" + listaDePeliculas.get(2).getFechaDeLanzamiento() + ")\n");

        //lista de series
        ArrayList<Serie> listaDeSeries = new ArrayList<>();
        listaDeSeries.add(serie1);
        listaDeSeries.add(serie2);
        listaDeSeries.add(serie3);
        listaDeSeries.add(serie4);

        System.out.println("Nro de series en la lista: " + listaDeSeries.size());
        System.out.println("Primera serie de la lista: " + listaDeSeries.getFirst().getNombre());
        System.out.println("Última serie de la lista: " + listaDeSeries.getLast().getNombre());
        System.out.println("Serie del index 2: " + listaDeSeries.get(2).getNombre() + " " + "(" + listaDeSeries.get(2).getTemporadas() + " temporadas)\n");

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peli1);
        lista.add(serie2);
        lista.add(peli3);
        lista.add(serie4);

        for (Pelicula item : listaDePeliculas){
            System.out.println("La clasificación de " + item.getNombre() + ": " + item.getClasificacion() + " Estrellas");
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Leonardo Di Caprio");
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");

        System.out.println("\n" + listaDeArtistas + "\n");
        Collections.sort(listaDeArtistas); // sort ordena las listas en orden ascendente
        System.out.println(listaDeArtistas + "\n");
        System.out.println(lista + "\n");
        Collections.sort(lista); // compara y ordena diferentes tipos de títulos (Peliculas con Series), gracias a implementar la interfaz comparable a la clase madre Título.
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento)); // compara y ordena por fecha de lanzamiento empezando por la más antigua a la más nueva
        System.out.println("\n" + lista);
    }
}