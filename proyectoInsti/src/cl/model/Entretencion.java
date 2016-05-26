
package cl.model;


public class Entretencion {
    private int id;
    private String nombre;
    private int diversion;
    
    public Entretencion() {
    }

    public Entretencion(int id, String nombre, int diversion) {
        this.id = id;
        this.nombre = nombre;
        this.diversion = diversion;
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

    public int getDiversion() {
        return diversion;
    }

    public void setDiversion(int diversion) {
        this.diversion = diversion;
    }
    
    


    
    
    
}
