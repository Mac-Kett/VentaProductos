public abstract class Servicio implements Facturable, Matematica{
    private int cant_horas;
    private double precio;

    public int getCant_horas() {
        return cant_horas;
    }

    private void setCant_horas(int cant_horas) {
        this.cant_horas = cant_horas;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public abstract double calcularPrecio();

    public double sumarPorcentaje(double a, int b){
        double total = 0;

        total = a * b / 100;

        return total;
    }

    public double montoTotalFacturado(){
        double resultado;

        resultado = this.precio * (IVA / 2) / 100;

        return resultado;
    }
}
