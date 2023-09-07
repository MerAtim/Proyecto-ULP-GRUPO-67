
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.List;
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
        
    }
    
    public List<Inscripcion>obtenerInscripciones(){
        
    }
    
    public List<Inscripcion>obtenerInscripcionesPorAlumno(int id){
        
    }
    
    public List<Materia>obtenerMateriasCursadas(int id){
        
    }
    
    public List<Materia>obtenerMateriasNoCursadas(int id){
        
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
        
    }
    
    public List<Alumno>obtenerAlumnosPorMateria(int idMateria){
        
    }
    
}
