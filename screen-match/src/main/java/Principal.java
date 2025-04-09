import calculos.CalculadoraDeTiempo;
import calculos.FiltroClasificacion;
import modelos.Episodio;
import modelos.Pelicula;
import modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setFechaDeLanzamiento(1999);
        matrix.setDuracionEnMinutos(120);
        matrix.evalua(10);

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La case del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(2);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        System.out.println(casaDragon.getDuracionEnMinutos());
        casaDragon.muestraFichaTecnica();

        CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();
        calculadoraDeTiempo.incluye(matrix);
        System.out.println(calculadoraDeTiempo.getTiempoTotal());

        FiltroClasificacion filtroClasificacion = new FiltroClasificacion();
        filtroClasificacion.filtra(matrix);

        System.out.println("Episodio");
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(3000);
        filtroClasificacion.filtra(episodio);




    }
}
