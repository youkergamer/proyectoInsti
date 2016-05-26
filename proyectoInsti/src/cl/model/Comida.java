
package cl.model;

public class Comida {
    private int id;
    private String nombre;
    private int alimentacion;

    public Comida() {
    }

    public Comida(int id, String nombre, int alimentacion) {
        this.id = id;
        this.nombre = nombre;
        this.alimentacion = alimentacion;
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

    public int getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(int alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    
    
}
