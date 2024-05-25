
package proyectounidad2;

/**
 *
 * @author garcd
 */
//CHIDO
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Conexion {
    private final String HOST = "localhost";
    private final String PUERTO = "3306";
    //private final String DB = "LA2unidad2";
    private final String USER = "root";
    private final String PASSWORD = "admin";
    
    private Connection conexion;
    
    public Connection getConexion(){
        //Connection conexion = null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); // Nombre del controlador JDBC de MySQL
            String url= "jdbc:mysql://"+HOST+":"+PUERTO+"/"; // URL de conexión MySQL sin base de datos especificada
            conexion = DriverManager.getConnection(url, USER, PASSWORD);
            JOptionPane.showMessageDialog(null,"Conexión exitosa");
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());    
            
        }
        return conexion;
    }
    
    
   
    public void ejecutarSQL(String sql) throws SQLException {
        String[] sentencias = sql.split(";"); // Separar las sentencias por el punto y coma

        Statement stmt = conexion.createStatement();
        for (String sentencia : sentencias) {
            stmt.execute(sentencia.trim()); // Ejecutar cada sentencia por separado
    }
    }

}
