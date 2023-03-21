package BD;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    // Conexion a la base de datos
    Connection con = null;
    
    public Connection conexion () {
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                           + "databaseName=master;"
                           + "user=sa;"
                           + "password=root;";

        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection ( conexionUrl );
            System.out.println ( "CONEXION EXITOSA" );
        }
    
        catch ( Exception ex ) {
            System.out.println ( "Error abrir: " + ex.getMessage () );
        }
            return con;
    }
    
}