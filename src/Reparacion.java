public class Reparacion extends Servicio {

    private int dificultad;
    public static final int AUMENTO_DIFICULTAD = 3;
    public static final int AUMENTO_PRECIO_PORCENTAJE = 25;

    public int getDificultad() {
        return dificultad;
    }

    private void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    @Override
    public double calcularPrecio() {

        double resultado = 0;

        resultado = super.getCant_horas() * super.getPrecio();

        if(this.dificultad >= AUMENTO_DIFICULTAD){
            resultado = resultado + (resultado * AUMENTO_PRECIO_PORCENTAJE /100);
        }
        return resultado;
    }

}
