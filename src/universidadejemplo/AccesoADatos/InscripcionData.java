package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.time.LocalDate;
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

    public void guardarInscripcion(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria) VALUES(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt("idInscripcion"));
                JOptionPane.showMessageDialog(null, "Inscripcion añadida con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar la inscripcion: " + ex.getMessage());
        }
    }

    private List<Inscripcion> obtenerInscripcionesQuery(String sql) {

        List<Inscripcion> inscripciones = new ArrayList<>();
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Alumno a = new Alumno(rs.getInt(5), rs.getInt(6), rs.getString(7), rs.getString(8), rs.getDate(9).toLocalDate(), rs.getBoolean(10));
                Materia m = new Materia(rs.getInt(11), rs.getString(12), rs.getInt(13), rs.getBoolean(14));
                Inscripcion i = new Inscripcion(rs.getInt(1), rs.getInt(2), a, m);
                inscripciones.add(i);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT * FROM inscripcion i  "
                + "JOIN alumno a ON i.idAlumno = a.idAlumno "
                + "JOIN materia m ON i.idMateria = m.idMateria";

        return obtenerInscripcionesQuery(sql);

    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) {
        String sql = "SELECT * FROM inscripcion i  "
                + "JOIN alumno a ON i.idAlumno = a.idAlumno "
                + "JOIN materia m ON i.idMateria = m.idMateria "
                + "where i.idAlumno = " + id;
        return this.obtenerInscripcionesQuery(sql);
    }

    public List<Materia> obtenerMateriasCursadas(int id) {
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria=materia.idMateria AND inscripcion.idAlumno=?;";
        List<Materia> materias = new ArrayList<Materia>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Materia materia;
            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("año"));
                materias.add(materia);

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener inscripciones" + ex.getMessage());
        }
        return materias;
    }

    public List<Materia> obtenerMateriasNoCursadas(int id) {
        // List<Materia> materiasNo
        return null;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {

    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {

    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        return null;
    }

}
