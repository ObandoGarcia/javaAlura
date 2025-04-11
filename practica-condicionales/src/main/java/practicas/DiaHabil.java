package practicas;

import java.util.Scanner;

public class DiaHabil {
    public static void main(String[] args) {

        /*
         * Programa que determina si un dia ingresado por el usuario es un dia habil o no
         * y lo muestra por mensaje al usuario.
         * */

        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Peticion de datos al usuario
        System.out.println("Ingrese el dia de la semana (en minusculas): ");
        String diaUsuario = scanner.next().toLowerCase();

        if (diaUsuario.equals("lunes") ||
            diaUsuario.equals("martes") ||
            diaUsuario.equals("miercoles") ||
            diaUsuario.equals("jueves") ||
            diaUsuario.equals("viernes")
        ){
            System.out.println(diaUsuario + " es un dia habil.");
        } else if (diaUsuario.equals("sabado") || diaUsuario.equals("domingo")) {
            System.out.println(diaUsuario + " no es un dia habil.");
        }
    }
}
