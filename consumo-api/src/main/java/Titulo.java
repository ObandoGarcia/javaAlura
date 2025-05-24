
import excepciones.ErrorEnConversionDeDuracionException;

public class Titulo implements Comparable<Titulo>{

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalDeEvaluciones;

    public Titulo() {
    }

    public Titulo(TituloDto tituloDto){
        this.nombre = tituloDto.title();
        this.fechaDeLanzamiento = Integer.valueOf(tituloDto.year());

        if (tituloDto.runtime().contains("N/A")){
            throw new ErrorEnConversionDeDuracionException("No se puede convertir la duracion, por contiene un N/A");
        }
        this.duracionEnMinutos = Integer.valueOf(tituloDto.runtime().substring(0, 2));
    }

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public double getSumaDeEvaluaciones() {
        return sumaDeEvaluaciones;
    }

    public void setSumaDeEvaluaciones(double sumaDeEvaluaciones) {
        this.sumaDeEvaluaciones = sumaDeEvaluaciones;
    }

    public int getTotalDeEvaluciones() {
        return totalDeEvaluciones;
    }

    public void setTotalDeEvaluciones(int totalDeEvaluciones) {
        this.totalDeEvaluciones = totalDeEvaluciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }

    @Override
    public String toString() {
        return "(Titulo:" +
                "nombre= " + nombre +
                ", fechaDeLanzamiento= " + fechaDeLanzamiento +
                ", duracion= " + duracionEnMinutos + ")";
    }
}
