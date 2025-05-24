import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ConsultaPelicula consultaPelicula = new ConsultaPelicula();

        System.out.println("Escriba el numero de la pelicula de Star Wars que quiere consultar: ");

        try{
            Integer numeroDePelicula = Integer.valueOf(scanner.next());

            Pelicula pelicula = consultaPelicula.buscaPelicula(4);

            System.out.println(pelicula);

            GeneradorDeArchivo generador = new GeneradorDeArchivo();
            generador.guardarJson(pelicula);

        }catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion...");
        }


    }
}
