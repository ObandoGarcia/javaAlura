package practicas;

import java.util.Scanner;

public class ValidacionContrasenia {
    public static void main(String[] args) {

        /*
        * Programa que en base a una contrasenia predefinida permita el acceso
        * al sistema y muestra el mensaje al usuario.
        *
        * */

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Contrasenia predefinida
        int contrasenia = 123456;

        //Pedir datos al usuario
        System.out.println("Ingrese contrasenia a validar: ");
        int contraseniaUsuario = scanner.nextInt();

        //Verificar si la contrasenia es igual a la predefinida
        if (contraseniaUsuario == contrasenia){
            System.out.println("Acceso permitido!");
        } else {
            System.out.println("Acceso denegado!");
        }

    }
}
