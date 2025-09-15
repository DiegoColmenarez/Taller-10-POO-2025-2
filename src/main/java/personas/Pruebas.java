package personas;

public class Pruebas {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.presentarse();
        System.out.println("\n-----------------");
        var estudiante = new Estudiante();
        estudiante.presentarse();
        System.out.println("-----------------");
        var profesor = new Profesor();
        profesor.presentarse();
    }
}