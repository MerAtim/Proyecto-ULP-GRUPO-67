
package universidadejemplo.Entidades;


public class Inscripcion {
    private int idInscripcion;
      double nota;
    private Alumno alumno;
    private Materia Materia;
  

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, double nota, Alumno alumno, Materia materia) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.Materia = Materia;
    }

    public Inscripcion( double nota, Alumno alumno, Materia Materia) {
        this.alumno = alumno;
        this.Materia = Materia;
    }

    

    public Inscripcion(double nota) {
        this.nota = nota;
    }

    public int getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(int idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return Materia;
    }

    public void setMateria(Materia Materia) {
        this.Materia = Materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    
    
    
}
