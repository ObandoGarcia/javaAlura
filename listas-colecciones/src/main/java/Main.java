import modelos.Pelicula;

import java.util.ArrayList;

public class Main {
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

        System.out.println("Tamanio de la lista: " + listaDePeliculas.size());
        System.out.println("La primera pelicula de la lista es: " + listaDePeliculas.getFirst().getNombre());

    }
}
