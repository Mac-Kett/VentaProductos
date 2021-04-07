public class Insumo implements Facturable, Matematica{

    private String nombre;
    private int porcentaje_ganacia;
    private Tipo tipo;
    private double precio;

    public Insumo(String n, int p, Tipo t, double pre){
        setNombre(n);
        setPorcentaje_ganacia(p);
        setPrecio(pre);
        this.tipo = t;
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPorcentaje_ganacia() {
        return porcentaje_ganacia;
    }

    private void setPorcentaje_ganacia(int porcentaje_ganacia) {
        this.porcentaje_ganacia = porcentaje_ganacia;
    }

    @Override
    public double montoTotalFacturado() {

        double resultado;

        resultado = sumarPorcentaje(precio, porcentaje_ganacia);

        resultado = sumarPorcentaje(resultado, IVA);

        return resultado;
    }

    @Override
    public double sumarPorcentaje(double a, int b) {

        double total = 0;

        total = a * b / 100;

        return total;
    }
}
