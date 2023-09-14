package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @authors Grupo_67
 */
public class MateriaData {

    private Connection connection = null;

    public MateriaData() {
        connection = Conexion.getConexion();
    }

    public void guardarMateria(Materia materia) {

        String sqlInsert = "INSERT INTO materia(nombre, año, estado VALUES(?,?,?)";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(2, materia.getAnioMateria());
            preparedStatement.setBoolean(3, materia.isActivo());
<<<<<<< HEAD
            System.out.println("linea 37");
            preparedStatement.executeUpdate();
            System.out.println("linea 39");
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            System.out.println("linea 41");
            if(resultSet.next()){
            System.out.println("linea 43");
                materia.setIdMateria(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo la materia con exito!!");
                System.out.println("linea 46");
            }
            System.out.println("linea 48");
=======
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()) {
                materia.setIdMateria(resultSet.getInt(1));
                JOptionPane.showMessageDialog(null, "Se guardo la materia con exito!!");
            }
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
            preparedStatement.close();
        } catch (SQLException ex) {
<<<<<<< HEAD
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!"+ex.getMessage());
=======
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!" + ex.getMessage());
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;
        try {
            String buscarMateria = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
            PreparedStatement preparedStatement = connection.prepareStatement(buscarMateria);
            preparedStatement.setInt(1, idMateria);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(idMateria);
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("año"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe la materia!!");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
        }
        return materia;
    }
<<<<<<< HEAD
    
    public void modificarMateria(Materia materia){
        
=======

    public void modificarMateria(Materia materia) {
        String upDateMateria = "UPDATE materia SET(?,?,?) WHERE idMateria = ?";
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
        try {
            
            String upDateMateria = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(upDateMateria);
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(2, materia.getAnioMateria());
<<<<<<< HEAD
            preparedStatement.setBoolean(3,materia.isActivo());
            preparedStatement.setInt(4, materia.getIdMateria());
            
            
            
=======
            preparedStatement.setBoolean(3, materia.isActivo());
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
            int seModifico = preparedStatement.executeUpdate();
            if (seModifico == 1) {
                JOptionPane.showMessageDialog(null, "Materia modificada!");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!"+ex.getMessage());
        }
    }

    public void eliminarMateria(int idMateria) {
        try {
<<<<<<< HEAD
            String deliteLogic = " UPDATE materia SET estado = 0 WHERE idMateria = ?";
            
=======
            String deliteLogic = " UPDATE materia SET(estado = 0) WHERE idMateria = ?";
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
            PreparedStatement preparedStatement = connection.prepareStatement(deliteLogic);
            preparedStatement.setInt(1, idMateria);
            int esModificado = preparedStatement.executeUpdate();
<<<<<<< HEAD
            
            if(esModificado > 1){
                JOptionPane.showMessageDialog(null,"Materia eliminada");
            }else{
                JOptionPane.showMessageDialog(null,"La materia no existe!");
=======
            if (esModificado == 1) {
                JOptionPane.showMessageDialog(null, "Materia eliminada");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no existe!");
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
        }
    }

    public ArrayList<Materia> listarMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();
<<<<<<< HEAD
        
=======
>>>>>>> d159f6aed5d09ac51e7001b003b96b3ecb3b9bde
        String listarMaterias = "SELECT * FROM materia WHERE estado = 1 ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(listarMaterias);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("año"));
                materias.add(materia);
            }
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
        }
        return materias;
    }
    
    
}