package calculos;

public class FiltroDeRecomendacion {
    // recomendar la pelicula en caso de que la clasificacion sea alta o no
    private String recomendacion;
    public void filtrar(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Una de las favoritas del momento");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Bien evaluada actualmente");
        } else {
            System.out.println("Colocalo en tu lista para ver después");
        }
    }
}
