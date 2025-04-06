package desafioConversorMonedas;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;

        System.out.println("************************************");
        System.out.println("\nNombre: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoDeCuenta);
        System.out.println("Saldo de la cuenta: " + saldo);
        System.out.println("\n************************************");

        String menu = """
                Escriba la opcion deseada:
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        while (opcion != 9){
            System.out.println(menu);
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                case 2:
                    System.out.println("Cual es el valor que desea retirar?");
                    double valorRetiro = scanner.nextDouble();

                    if (saldo < valorRetiro){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorRetiro;
                        System.out.println("El saldo actualizado es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Cual es el valor que desea depositar?");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("El saldo actualizado es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Has ingresado un valor que no corresponde a la lista de opciones");
                    break;
            }
        }
    }
}
