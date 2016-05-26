
package cl.model;


public class Golpe {
    private int id;
    private String nombre;
    private int daño;

    public Golpe() {
    }

    public Golpe(int id, String nombre, int daño) {
        this.id = id;
        this.nombre = nombre;
        this.daño = daño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
    
    
}
