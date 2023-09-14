package universidadejemplo;


import javax.swing.JOptionPane;
import java.sql.*;


public class UniversidadEjemplo {

    public static void main(String[] args) {
        
        
        System.out.println("Hello word!!");
       
//        try {
//            Class.forName("org.mariadb.jdbc.Driver");
//            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/universidadulp", "root", "");
         
            //Agregar Alumno:
            
            /*String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                    + " VALUES(40123123, 'Alum', 'Alberto', '1990-07-20', 1),"
                    + "(36665000,'Kamimura', 'Gabriel', '2001-01-01', 1),"
                    + "(40356215, 'Theler', 'Jesica', '1999-04-22', 1), "
                    + "(38321654, 'Alonso', 'Ruth', '2003-09-01', 1)"; 
            
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.executeUpdate();
            
            
            
            
            //Mostrar Alumnos:
            
            String sql= "Select * from alumno where estado = true";
            PreparedStatement ps=conn.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            
            while (resultado.next()){
                System.out.println("Id "+resultado.getInt("idAlumno"));
                System.out.println("DNI "+resultado.getInt("dni"));
                System.out.println("Apellido "+resultado.getString("apellido"));
                System.out.println("Nombre  "+resultado.getString("nombre"));
                System.out.println("Fecha de Nacimiento "+resultado.getDate("fechaNacimiento"));
                System.out.println("Estado "+resultado.getInt("estado"));
                System.out.println("");
            }
               
            
            
            //Agregar Materias:
            
            String sql = "INSERT INTO materia (idMateria, nombre, año, estado) "
                    + "VALUES (null, 'Matematicas', 1, true),"
                    + "(null, 'Matematicas II', 2, true),"
                    + "(null, 'Matematicas III', 3, true),"
                    + "(null, 'Matematicas IV', 4, true)";
                
            PreparedStatement ps = conn.prepareStatement(sql);
            int filas =ps.executeUpdate();
            if (filas > 0){
            JOptionPane.showMessageDialog(null, "Materia agregada exitosamente.")
            }
            
            
            //Inscribir Alumnos en las materias:
            
            String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria)"
                    + "VALUES(8,1,1),(6,1,2),(9,2,1),(7,2,2),(8,3,1),(10,3,2)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            
            
            
            
            //Consultar alumnos con nota superior a 8
            
            String sql = "SELECT a.nombre nombreAlumno, a.apellido, m.nombre nombreMateria, nota FROM inscripcion i "
                    + "JOIN alumno a ON i.idAlumno = a.idAlumno "
                    + "JOIN materia m ON i.idMateria = m.idMateria "
                    + "WHERE nota >= 8";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultado = ps.executeQuery();
            
            while (resultado.next()){
                System.out.println("-----Alumno-----");
                System.out.println(resultado.getString("nombreAlumno"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("nombreMateria"));
                System.out.println(resultado.getInt("nota"));
            }
            
            
             
            
            //Agregar otro alumno:
            
            /*String sql = "INSERT INTO alumno(dni, apellido, nombre, fechaNacimiento, estado)"
                    + " VALUES(52745628, 'Lopez', 'Juan', '2000-08-29', true)";
            PreparedStatement ps=conn.prepareStatement(sql);
            int filas =ps.executeUpdate();
                 if (filas > 0){
            JOptionPane.showMessageDialog(null, "Alumno agregado exitosamente.");
            }
            
           
            
            
           //Dar de baja a un alumno:
           
            String sql = "UPDATE alumno SET estado = false WHERE dni = 52745628";
            PreparedStatement ps= conn.prepareStatement(sql);
            ps.executeUpdate();
                       
            */
            
                        
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Error al cargar el driver");
//        } catch (SQLException ex) {
//             JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
//        }
    }
}

