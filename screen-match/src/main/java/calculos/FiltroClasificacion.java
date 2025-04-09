package calculos;

public class FiltroClasificacion {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        } else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular por el momento");
        } else {
            System.out.println("Ver despues");
        }
    }
}
