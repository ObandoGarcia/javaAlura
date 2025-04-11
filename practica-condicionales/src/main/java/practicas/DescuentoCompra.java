package practicas;

import java.util.Scanner;

public class DescuentoCompra {
    public static void main(String[] args) {

        /*
        * Programa que calcula el valor de descuento de una compra de acuerdo a los siguientes criterios
        * el valor del descuento es del 10% si la compra es igual o mayor a $100.00
        * si el valor de la compra es menor a 100.00 no aplica descuento, se muestra el
        * resultado de la verificacion con un mensaje que indica si aplica descuento o no
        * y el valor total a pagar.
        * */

        double valorTotal = 0.0, descuento = 0.0;

        //Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        //Peticion del valor de la compra al usuario
        System.out.println("Ingrese el valor de la compra: $");
        double valorCompra = scanner.nextDouble();

        //Verificacion de las condiciones de descuento
        if (valorCompra >= 100.00){
            descuento = valorCompra * 0.1;
            valorTotal = valorCompra - descuento;
            System.out.println("Descuento del 10% aplicado");
            System.out.println("Nuevo valor: $" + valorTotal);
        } else {
            System.out.println("Descuento no aplicado");
            System.out.println("Valor total: $" + valorCompra);
        }
    }
}
