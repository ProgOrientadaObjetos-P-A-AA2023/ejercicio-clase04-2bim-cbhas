package paquete2;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;

    public Persona(String n, String ide, int ed) {
        nombre = n;
        apellido = ide;
        edad = ed;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }

    public void establecerEdad(int e) {
        edad = e;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public int obtenerEdad() {
        return edad;
    }

}
