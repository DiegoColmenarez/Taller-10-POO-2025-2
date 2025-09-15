package vehiculos;

public class ClasePrueba {
    public static void main(String[] args) {
        var vehiculo = new Vehiculo();
        vehiculo.moverse();
        System.out.println("\n-------------------");
        var bici = new Bicicleta();
        bici.moverse();
    }
}