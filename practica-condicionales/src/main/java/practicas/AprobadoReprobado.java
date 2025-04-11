package practicas;

import java.util.Scanner;

public class AprobadoReprobado {
    public static void main(String[] args) {

        /*
        * Programa que indica si un alumno es aprobado o reprobado de un curso
        * de acuerdo a criterios basados en notas:
        * Aprobado si su promedio final es mayor a 7.0
        * Recuperacion si su promedio final esta entre 5.0 y 6.9
        * Reprobado si su promedio final es inferior a 5.0
        * */

        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir el valor de la media por teclado
        System.out.println("Ingrese el valor del promedio final del estudiante: ");

        //Ingreso de valor de la media calculada previamente
        double media = scanner.nextDouble();

        //Verificacion de la media de acuerdo al criterio de notas
        if (media >= 7.0){
            System.out.println("El estudiante tuvo un promedio de: " + media + " y fue aprobado");
        } else if (media > 5.0 && media <= 6.9) {
            System.out.println("El estudiante tuvo un promedio de: " + media + " y esta en recuperacion");
        } else if (media <= 4.9){
            System.out.println("El estudiante tuvo un promedio de: " + media + " y fue reprobado");
        } else {
            System.out.println("El valor ingresado no es un valor valido");
        }

    }
}
