package catalogoPeliculas;

import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota para la pelicula Matrix: ");
            nota = scanner.nextDouble();

            if (nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }

        }

        System.out.println("Media: " + (mediaEvaluaciones / totalEvaluaciones));
    }
}
