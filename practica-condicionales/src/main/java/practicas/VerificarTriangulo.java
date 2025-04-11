package practicas;

import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {

        /*
        * Programa que permite validar si tres lados pueden formar un triangulo,
        *  tomando en cuenta que para fomrar un triangulo la suma de dos de sus lados
        * debe ser mayor al tercer lado.
        * */

        //Instancia de la clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Pedir lados al usuario
        System.out.println("Ingrese el valor del primer lado: ");
        int lado1 = scanner.nextInt();

        System.out.println("Ingrese el valor del segundo lado: ");
        int lado2 = scanner.nextInt();

        System.out.println("Ingrese el valor del tercer lado: ");
        int lado3 = scanner.nextInt();

        //Verificar los lados
        if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado3 + lado1 > lado2){
            System.out.println("Los lados pueden formar un triangulo");
        } else {
            System.out.println("Los lados ingresados no pueden formar un triangulo, verifica de nuevo");
        }
    }
}
