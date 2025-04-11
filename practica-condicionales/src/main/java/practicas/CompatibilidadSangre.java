package practicas;

import java.util.Scanner;

public class CompatibilidadSangre {
    public static void main(String[] args) {

        /*
        * Programa que determina si un donante es compatible para donar sangre
        * Criterios:
        * -Debe tener entre 18 y 65 anios
        * -Pesar mas de 50kg
        * Muestra que criterio no fue cumplido con un mensaje al usuario
        * */

        //Declaracion de variables
        boolean cumpleEdad = false;
        boolean cumplePeso = false;
        int peso = 0, edad = 0;

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Ingreso de datos
        System.out.println("Ingrese la edad del donate: ");
        edad = scanner.nextInt();

        //Verificar la edad del donate
        if (!(edad >= 18 && edad <= 65)){
            System.out.println("El donante no es compatible.");
            System.out.println("Motivo: debe tener entre 18 y 65 anios.");
            cumpleEdad = true;
        } else {
            System.out.println("Ingrese el peso del donante: ");
            peso = scanner.nextInt();

            if (peso > 50){
                cumplePeso = true;
            }

            if (cumpleEdad && cumplePeso){
                System.out.println("El donate es compatible");
            } else {
                System.out.println("El donante no es compatible.");
                System.out.println("Motivo: debe tener mas de 50kg.");
            }
        }
    }
}
