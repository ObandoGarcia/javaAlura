package catalogoPeliculas;

public class Decisiones {
    public static void main(String[] args) {

        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = false;
        double notaPelicula = 8.2;

        if (fechaLanzamiento > 2022){
            System.out.println("Peliculas mas populares: ");
        } else {
            System.out.println("Peliculas retro que aun vale la pena ver: ");
        }

        String plan = "premium";

        if (incluidoEnPlan || plan.equals("plus")){
            System.out.println("Disfrute la pelicula");
        } else {
            System.out.println("Pelicula no disponible para el plan actual");
        }
    }
}
