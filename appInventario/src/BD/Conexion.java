package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    // Conexion a la base de datos
    Connection con = null;
    
    public Connection conexion () {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                           + "database=tienda;"
                           + "user=sa;"
                           + "password=root;"
                           + "encrypt=false;";

        try{
            con = DriverManager.getConnection ( conexionUrl );
            System.out.println ( "CONEXION EXITOSA" );
        }
    
        catch ( Exception ex ) {
            System.out.println ( "Error abrir: " + ex.getMessage () );
        }
            return con;
    }
    
}