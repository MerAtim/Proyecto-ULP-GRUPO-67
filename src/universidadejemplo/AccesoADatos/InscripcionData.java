package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.time.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

public class InscripcionData {

    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
        this.con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        try {
            String sql = "INSERT INTO inscripcion (nota, idAlumno, idMateria, estado) VALUES(?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.setBoolean(4, insc.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
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
                Alumno a = new Alumno(rs.getInt("idAlumno"), rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getDate("fechaNacimiento").toLocalDate(), rs.getBoolean("estado"));
                Materia m = new Materia(rs.getInt("idMateria"), rs.getString("nombre"), rs.getInt("año"), rs.getBoolean("estado"));
                Inscripcion i = new Inscripcion(rs.getInt("idInscripto"), rs.getInt("nota"), a, m, rs.getBoolean("estado"));
                inscripciones.add(i);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error " + ex.getMessage());
        }
        return inscripciones;
    }

    public List<Inscripcion> obtenerInscripciones() {
        String sql = "SELECT idInscripto, m.idMateria, m.nombre, nota, m.estado, i.estado, a.idAlumno, dni, apellido, a.nombre, fechaNacimiento, a.estado, año FROM inscripcion i "
                + "JOIN alumno a ON i.idAlumno = a.idAlumno "
                + "JOIN materia m ON i.idMateria = m.idMateria ";
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
        List<Materia> materias = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE materia.estado=0";
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
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia" + ex.getMessage());
        }
        return materias;
    }

    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria) {
        String sql = "UPDATE inscripcion SET estado=false WHERE idAlumno=? AND idMateria=?;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, idAlumno);
            preparedStatement.setInt(2, idMateria);
            int resultado = preparedStatement.executeUpdate(); //leer sobre result set y enteros
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "La inscripción fue borrada con éxito");
            } else {
                JOptionPane.showMessageDialog(null, "Los datos ingresados no son válidos");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripción" + ex.getMessage());
        }
    }

    public void actualizarNota(int idAlumno, int idMateria, double nota) {
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno=? AND idMateria=?;";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setDouble(1, nota);
            preparedStatement.setInt(2, idAlumno);
            preparedStatement.setInt(3, idMateria);
            int resultado = preparedStatement.executeUpdate();
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Nota modificada exitosamente");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar nota");
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idMateria) {
        List<Alumno> alumnos = new ArrayList<>();
        String sql = "SELECT a.* FROM inscripcion i JOIN alumno a ON i.idAlumno=a.idAlumno JOIN materia m ON i.idMateria = m.idMateria WHERE i.idMateria = ?";
        try {
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, idMateria);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Alumno alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setFechaNacimiento(resultSet.getDate("FechaNacimiento").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("estado"));
                alumnos.add(alumno);
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener la tabla Inscripcion");
        }
        return alumnos;

    }

}
