package modelos;

public class Pelicula extends Titulo{
    private String director;

    public Pelicula(){
    }

    public Pelicula(String nombre){
        this.setNombre(nombre);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() + ")";
    }
}
