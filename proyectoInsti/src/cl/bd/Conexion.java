package cl.bd;

import java.sql.*;

public class Conexion {
    private Connection con;// Establecer la conexión
    private Statement sen; // Ejecutar consultas
    private ResultSet rs;  // Recorrer los resultados (Tabla)
    
    public Conexion(String server, String bd, String user, String pass) throws SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
        //jdbc:mysql://localhost/bd_juegos?user=root&password=123456
        
        
        String url = protocolo + 
                server + "/" + 
                bd + "?" + 
                lineaUser + "&" +
                lineaPass;
        
        System.out.println(url);
        
        con = DriverManager.getConnection(url);
    }
    
    /*
    consultas actualizan los datos --> delete, insert, update
    ver datos--> select
    */
    
    //insert, delete, update
    public void ejecutar(String query) throws SQLException{
        sen=con.createStatement();//abrir
        sen.executeUpdate(query);//ejecuto
        sen.close();//cierro
    }
    
    public ResultSet ejecutarSelect(String query) throws SQLException{
        sen=con.createStatement();
        rs=sen.executeQuery(query);
        return rs;        
    }
    
    public void desconectar() throws SQLException{
        sen.close();
    }
}
