package practicas;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        /*
        * Programa que indica si un numero ingresado por el usuario por medio del teclado
        * es para o es impar
        * */

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir al usuario que ingrese un numero
        System.out.println("Ingresa un numero entero: ");

        //Leer valor y almacenarlo en una variable llamada numeroIngresado
        int numeroIngresado = scanner.nextInt();

        //Verificar numero con la estructura condicional if
        if (numeroIngresado % 2 == 0){
            System.out.println("El numero ingresado " + numeroIngresado + " es par");
        } else {
            System.out.println("El numero ingresado " + numeroIngresado + " es impar");
        }

    }
}
