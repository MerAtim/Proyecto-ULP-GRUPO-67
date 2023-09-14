
package universidadejemplo.Entidades;

public class Inscripcion {
    private int idInscripcion;
    double nota;
    private Alumno alumno;
    private Materia materia;
    private boolean estado;
  
    public Inscripcion() {
    }

    public Inscripcion(int idInscripcion, double nota, Alumno alumno, Materia materia, boolean estado) {
        this.idInscripcion = idInscripcion;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
        this.estado = estado;
    }

    public Inscripcion( double nota, Alumno alumno, Materia materia, boolean estado) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
        this.estado = estado;
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

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Inscripcion: " + "\nIdInscripcion: " + idInscripcion + "\nnota: " + nota + "\nAlumno: " + alumno + "\nMateria: " + materia + "\n--------------\n";
        }
}
