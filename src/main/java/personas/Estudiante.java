package personas;

public class Estudiante extends Persona{
    @Override
    public void presentarse() {
        super.presentarse();
        System.out.println("Soy un estudiante");
    }
}