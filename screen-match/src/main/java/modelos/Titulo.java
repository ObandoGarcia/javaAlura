package modelos;

public class Titulo {

    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totalDeEvaluciones;

    public Titulo() {
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

    public void muestraFichaTecnica(){
        System.out.println("El nombre del titulo es: " + this.nombre);
        System.out.println("Su fecha de lanzamiento es: " + this.fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeEvaluaciones += nota;
        this.totalDeEvaluciones++;
    }

    public double calculaMedia(){
        return sumaDeEvaluaciones / totalDeEvaluciones;
    }
}
