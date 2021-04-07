public class Armado extends Servicio{

    @Override
    public double calcularPrecio() {
        return super.getCant_horas() * super.getPrecio();
    }

}
