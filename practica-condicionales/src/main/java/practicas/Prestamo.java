package practicas;

import java.util.Scanner;

public class Prestamo {
    public static void main(String[] args) {

        /*
        * Programa que determina si un valor monetario ingresado por el usuario
        * esta entre el rango de 1000.00 a 5000.00 dolares.
        * La salida muestra si esta o no el rango con un mensaje al usuario
        * */

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese el valor de dinero a verificar
        System.out.println("Ingrese el valor del prestamo: $");
        double prestamo = scanner.nextDouble();

        //Verificar intervalo del prestamo
        if (prestamo >= 1000.00 && prestamo <= 5000.00){
            System.out.println("El valor: $" + prestamo + " esta dentro del intervalo permitido para el prestamo");
        } else {
            System.out.println("El valor: $" + prestamo + " no esta dentro del intervalo permitido para el prestamo");
        }

    }
}
