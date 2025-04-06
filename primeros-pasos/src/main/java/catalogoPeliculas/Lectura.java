package catalogoPeliculas;

import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el nombre de tu pelicula favorita: ");
        String pelicula = scanner.nextLine();

        System.out.println("Escribe la fecha de lanzamiento: ");
        int fechaLanzamiento = scanner.nextInt();

        System.out.println("Escribe la calificacion de la pelicula: ");
        double nota = scanner.nextDouble();

        System.out.println("Pelicula: " + pelicula);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Calificacion: " + nota);
    }
}
