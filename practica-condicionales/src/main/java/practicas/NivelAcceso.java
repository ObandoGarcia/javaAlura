package practicas;

import java.util.Scanner;

public class NivelAcceso {
    public static void main(String[] args) {

        /*
        * Programa que permite validar clave de acceso al sistema, y ademas el nivel de acceso
        * que el usuario posee.
        * */

        //Declaracion de variables
        int codigoAcceso = 2023;
        int nivelAcceso = 0;

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir datos
        System.out.println("Ingrese el codigo de acceso");
        codigoAcceso = scanner.nextInt();

        System.out.println("Ingrese nivel de acceso: ");
        nivelAcceso = scanner.nextInt();

        if (codigoAcceso == 2023){
            System.out.println("Codigo de acceso correcto");

            if (nivelAcceso == 1 || nivelAcceso == 2 || nivelAcceso == 3){
                System.out.println("Nivel de acceso permitido");
                System.out.println("Acceso permitido. Bienvenido al sistema!");
            } else {
                System.out.println("Nivel de acceso incorrecto");
            }
        } else {
            System.out.println("Acceso denegado");
            System.out.println("Motivo: codigo de acceso incorrecto y nivel de acceso no es valido");
        }
    }
}
