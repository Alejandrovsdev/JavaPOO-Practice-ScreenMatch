package modelos;

import calculos.Clasificacion;

public class Pelicula extends Titulo implements Clasificacion {
    private String director;

    public Pelicula(){
        super();
    }

    public Pelicula(String nombre, int fechaDeLanzamiento, boolean incluidoEnPlan, int duracionEnMinutos, String director) {
        super(nombre, fechaDeLanzamiento, incluidoEnPlan, duracionEnMinutos);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
