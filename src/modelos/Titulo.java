package modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
    private boolean incluidoEnPlan;
    private int sumaDeLasEvaluaciones;
    private int TotalDeEvaluaciones;
    private int duracionEnMinutos;

    public Titulo() {
    }

    public Titulo(String nombre, int fechaDeLanzamiento, boolean incluidoEnPlan) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public Titulo(String nombre, int fechaDeLanzamiento, boolean incluidoEnPlan, int duracionEnMinutos) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
        this.incluidoEnPlan = incluidoEnPlan;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public Titulo(TituloOmdb tituloOmdb) {
        this.nombre = tituloOmdb.title();
        this.fechaDeLanzamiento = Integer.valueOf(tituloOmdb.year());
        this.duracionEnMinutos = Integer.valueOf(tituloOmdb.runtime().substring(0, 2));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getSumaDeLasEvaluaciones() {
        return sumaDeLasEvaluaciones;
    }

    public void setSumaDeLasEvaluaciones(int sumaDeLasEvaluaciones) {
        this.sumaDeLasEvaluaciones = sumaDeLasEvaluaciones;
    }

    public int getTotalDeEvaluaciones() {
        return TotalDeEvaluaciones;
    }

    public void setTotalDeEvaluaciones(int totalDeEvaluaciones) {
        TotalDeEvaluaciones = totalDeEvaluaciones;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void mostrarInfoTitulo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Incluido en Plan: " + (incluidoEnPlan ? "Sí" : "No"));
        System.out.println("Suma de las Evaluaciones: " + sumaDeLasEvaluaciones);
        System.out.println("Total de Evaluaciones: " + TotalDeEvaluaciones);
        System.out.println("Duración en Minutos: " + getDuracionEnMinutos());
        System.out.println("Media de Evaluaciones: " + calculaMedia());
    }

    public void evalua(double nota) {
        sumaDeLasEvaluaciones = (int) (sumaDeLasEvaluaciones + nota);
        TotalDeEvaluaciones++;
    }

    public double calculaMedia() {
        if (TotalDeEvaluaciones == 0) {
            return 0; // Evita la división por cero
        }
        return (double) sumaDeLasEvaluaciones / TotalDeEvaluaciones;
    }

    // este método de la interfaz Comparable sobreescribe el orden natural de ordenamiento comparando el nombre de los títulos
    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
