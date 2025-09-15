package vehiculos;

public class Bicicleta extends Vehiculo{
    @Override
    public void moverse() {
        super.moverse();
        System.out.println("en bicicleta.");
    }
}
