package classroom;

public class Persona {

    final long cedula;
    String nombre;
    static int totalPersonas = 0; 
    
    public Persona() {
        this.nombre = ""; 
        this.cedula = totalPersonas++; 
    }

    public Persona(long cedula, String nombre) {
        this.nombre = nombre;
        this.cedula = cedula;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.nombre = "";
        this.cedula = cedula;
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


