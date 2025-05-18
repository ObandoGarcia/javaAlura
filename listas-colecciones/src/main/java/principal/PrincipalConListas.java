package principal;

import modelos.Pelicula;
import modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula matrix = new Pelicula();
        matrix.setNombre("Matrix");
        matrix.setDuracionEnMinutos(120);
        matrix.setFechaDeLanzamiento(1999);

        Pelicula barbie = new Pelicula();
        barbie.setNombre("Barbie");
        barbie.setDuracionEnMinutos(123);
        barbie.setFechaDeLanzamiento(2022);

        Pelicula duroDeMatar = new Pelicula();
        duroDeMatar.setNombre("Duro de matar");
        duroDeMatar.setDuracionEnMinutos(150);
        duroDeMatar.setFechaDeLanzamiento(1998);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(matrix);
        listaDePeliculas.add(barbie);
        listaDePeliculas.add(duroDeMatar);

        /*for (Pelicula pelicula : listaDePeliculas){
            System.out.println(pelicula.toString());
        }*/

        //listaDePeliculas.forEach(pelicula -> System.out.println(pelicula.toString()));

        listaDePeliculas.forEach(System.out::println);

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Arnold");
        listaDeArtistas.add("Silvestre Stallone");
        listaDeArtistas.add("Eva Mendez");

        Collections.sort(listaDeArtistas);

        System.out.println(listaDeArtistas);

        Collections.sort(listaDePeliculas);
        listaDeArtistas.forEach(System.out::println);

        listaDePeliculas.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));

    }
}
