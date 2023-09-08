
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;

public class AlumnoData {
    private Connection con;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado) VALUES (?, ?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, alumno.getDni());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setString(4, alumno.getNombre());
            ps.setDate(5, Date.valueOf(alumno.getFechaNac())); //localDate a Date
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                JOptionPane.showMessageDialog(null, "Alumno añadido con exito."); 
            }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());            
        }   
    }
    
    public Alumno buscarAlumno(int id){
        Alumno alumno = null;
        String sql = "SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno = ? AND estado =1";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                alumno = new Alumno();
                alumno.setIdAlumno(id);
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setActivo(true);
            }else{
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
            }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
                    }
            return alumno;
        }
    

    
    public Alumno buscarAlumnoPorDni(int dni){
        
    }
    
    public List<Alumno>listarAlumnos(){
        
    }
    
    public void modificarAlumno(Alumno alumno){
        
    }
    
    public void eliminarAlumno(int id){
        
    }
    
}
