import java.util.ArrayList;

public class Comercio {

    private ArrayList<Facturable> historial;

    public Comercio(){
        this.historial = new ArrayList<Facturable>();
    }

    public int cantServiciosSimples(int a){
        int contador = 0;

        for(Facturable f: this.historial){
            if(f instanceof Reparacion){
                if(((Reparacion) f).getDificultad() <= 2){
                    contador++;
                }
            }
        }
        return contador;

    }
}
