package practicas;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {

        /*
        * Programa que determina cual de dos numeros ingresados por el usuario
        * es mayor o si son iguales y muestra un mensaje al usuario.
        * */

        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Peticion de numeros al usuario
        System.out.println("Ingrese el primer numero a comparar: ");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero a comparar: ");
        int numero2 = scanner.nextInt();

        //Comparacion de numeros
        if (numero1 == numero2){
            System.out.println("Los numeros ingresados son iguales");
        } else if (numero1 > numero2) {
            System.out.println("El numero mayor es : " + numero1);
        } else {
            System.out.println("El numero mayor es: " + numero2);
        }
    }
}
