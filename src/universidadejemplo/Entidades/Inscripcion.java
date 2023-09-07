
package universidadejemplo.Entidades;


public class Inscripcion {
    private int idInscripcion;
    private Alumno alumno;
    private Materia Materia;
    double nota;

    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, Alumno alumno, Materia Materia, double nota) {
        this.idInscripcion = idInscripcion;
        this.alumno = alumno;
        this.Materia = Materia;
        this.nota = nota;
    }

    public Inscripcion(Alumno alumno, Materia Materia, double nota) {
        this.alumno = alumno;
        this.Materia = Materia;
        this.nota = nota;
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
