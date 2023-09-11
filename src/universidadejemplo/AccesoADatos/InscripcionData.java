
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    
    
    
    public void guardarInscripcion(Inscripcion insc){
        String sql="INSERT INTO inscripcion (idInscripcion, nota, idAlumno, idMateria)VALUES(?,?,?,?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, insc.getIdInscripcion());
            ps.setDouble(2, insc.getNota());
            ps.setInt(3, insc.getAlumno());
        }
    }
    
    public List<Inscripcion>obtenerInscripciones(){
        
    }
    
    public List<Inscripcion>obtenerInscripcionesPorAlumno(int id){
        
    }
    
    public List<Materia>obtenerMateriasCursadas(int id){
        List<Materia>materias=new ArrayList<Materia>();
        try{
            String sql="SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?;";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            Materia materia;
            while(rs.next()){
                materia=new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);
                
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones"+ex.getMessage());
        }
        return materias;
    }       
    
    public List<Materia>obtenerMateriasNoCursadas(int id){
        List<Materia>materiasNoCursadas=new ArrayList<Materia>();
        
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno>obtenerAlumnosPorMateria(int idMateria){
        
    }
    
}
