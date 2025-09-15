package personas;

public class Profesor extends Persona {
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy un profesor");
    }
}