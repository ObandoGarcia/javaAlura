package catalogoPeliculas;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaLanzamiento = 1999;
        boolean incluidoEnPlan = true;
        double notaPelicula = 8.2;

        double media =  (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin de milenio
                Fue lanzada en:
                """ + fechaLanzamiento;

        System.out.println(sinopsis);

        double clasificacion = media / 2;
        System.out.println(clasificacion);
    }
}
