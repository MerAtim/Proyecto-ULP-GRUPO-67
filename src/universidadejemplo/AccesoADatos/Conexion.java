
package universidadejemplo.AccesoADatos;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost:3306/";
    private static final String DB="universidadulp";
    private static final String USUARIO="root";
    private static String PASSWORD="";
    private static Connection connection;

    private Conexion() {
    }
    
    public static Connection getConexion(){
        if(connection==null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                connection=DriverManager.getConnection(URL+DB+"?useLegacyDatetimecode=false&serverTimezone=UTC"+"&user="+USUARIO+"&password="+PASSWORD);
            }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al conectarse a la BD"+ex.getMessage());
            }catch(ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers"+ex.getMessage());
            }
        }
        return connection;
    }
    
    
}
