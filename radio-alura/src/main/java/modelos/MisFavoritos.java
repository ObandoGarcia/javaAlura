package modelos;

public class MisFavoritos {
    public void incluyeAudio(Audio audio){
        if (audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() + " es uno de los favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + " tambien es uno de los favoritos");
        }
    }
}
