
package cl.model;

import cl.bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class Data {
    private Conexion c;
    private String query;
    private ResultSet rs;
    private List<Comida> comida;
    private List<Entretencion> diversion;
    private List<Golpe> golpe;

    public Data() throws SQLException{
             c = new Conexion(
            "localhost",
            "bd_mascota",
            "root",
            ""
        );
    }
    
    public void vidaMascota(int vida) throws SQLException{
        query = "UPDATE mascota SET vida = "+100+";";
        c.ejecutar(query);
    }
    public void golpearMascota(Golpe g) throws SQLException{
        query = "UPDATE mascota SET vida = "+g.getDaño()+"where ";
        System.out.println(query);
        c.ejecutar(query);
    }
    public void alimentarMascota(int comida) throws SQLException {
        query = "UPDATE mascota SET vida = "+comida+";";
        System.out.println(query);
        c.ejecutar(query);
    }
    
    
    
    
}
