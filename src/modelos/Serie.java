package modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie() {
        super();
    }

    public Serie(String nombre, int fechaDeLanzamiento, boolean incluidoEnPlan, int temporadas, int episodiosPorTemporada, int minutosPorEpisodio) {
        super(nombre, fechaDeLanzamiento, incluidoEnPlan);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public Serie(String nombre, int fechaDeLanzamiento, boolean incluidoEnPlan, int duracionEnMinutos, int episodiosPorTemporada, int temporadas, int minutosPorEpisodio) {
        super(nombre, fechaDeLanzamiento, incluidoEnPlan, duracionEnMinutos);
        this.episodiosPorTemporada = episodiosPorTemporada;
        this.temporadas = temporadas;
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: " + getNombre() + "(" + getFechaDeLanzamiento() + ")";
    }
}
