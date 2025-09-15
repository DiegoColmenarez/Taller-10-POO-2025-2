package malaSobrescritura;

public class A {
    public void mensaje(){
        System.out.println("Hola mundo");
    }

    public static void main(String[] args) {
        var error = new B();
        error.mensaje();
    }
}
class B extends A{
    public void mensaje() {
        super.mensaje();
        System.out.println("Un especial saludo.");
    }
   /** @Override
    public void mensaje(String nombre){
        super.mensaje();
        System.out.println("Un especial saludo para: " + nombre);
    }**/
}