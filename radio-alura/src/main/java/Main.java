import modelos.Cancion;
import modelos.MisFavoritos;
import modelos.Podcast;

public class Main {
    public static void main(String[] args) {

        Cancion cancion = new Cancion();
        cancion.setTitulo("Forever");
        cancion.setCantante("Kiss");

        Podcast podcast = new Podcast();
        podcast.setPresentador("Gabriela Aguilar");
        podcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100; i++) {
            cancion.meGusta();
        }

        for (int i = 0; i < 5000; i++) {
            cancion.reproduce();
        }

        System.out.println("Total reproducciones: " + cancion.getTotalDeReproducciones());
        System.out.println("Total me gusta: " + cancion.getTotalDeMeGusta());

        MisFavoritos misFavoritos = new MisFavoritos();
        misFavoritos.incluyeAudio(cancion);
    }
}
