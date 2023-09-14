
package universidadejemplo.AccesoADatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadejemplo.Entidades.Materia;


/**
 *
 * @authors Grupo_67
 */
public class MateriaData {
    private Connection connection =  null;

    public MateriaData() {
        connection = Conexion.getConexion();        
    }
    
    
    public void guardarMateria(Materia materia){
        

        try {
            String sqlInsert = "INSERT INTO materia(nombre, año, estado)"
                            + "VALUES(?,?,?)";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(2, materia.getAnioMateria());
            preparedStatement.setBoolean(3, materia.isActivo());
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
            preparedStatement.close();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!"+ex.getMessage());
        }
    }
    
    public Materia buscarMateria(int idMateria){
        Materia materia = null;
        try {
            
            String buscarMateria = "SELECT nombre, año FROM materia WHERE idMateria = ? AND estado = 1";
            
            PreparedStatement preparedStatement = connection.prepareStatement(buscarMateria);
            
            preparedStatement.setInt(1,idMateria);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            if(resultSet.next()){
                materia = new Materia();
                
                materia.setIdMateria(idMateria);
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("año"));
                
            }else{
            
                JOptionPane.showMessageDialog(null,"No existe la materia!!");
            }
            
            preparedStatement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
        }
        
        
        return materia;
    }
    
    public void modificarMateria(Materia materia){
        
        try {
            
            String upDateMateria = "UPDATE materia SET nombre = ?, año = ?, estado = ? WHERE idMateria = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(upDateMateria);
            
            preparedStatement.setString(1, materia.getNombre());
            preparedStatement.setInt(2, materia.getAnioMateria());
            preparedStatement.setBoolean(3,materia.isActivo());
            preparedStatement.setInt(4, materia.getIdMateria());
            
            
            
            int seModifico = preparedStatement.executeUpdate();
            
            if(seModifico == 1 ){
                JOptionPane.showMessageDialog(null,"Materia modificada!");
            }
            else{
                JOptionPane.showMessageDialog(null,"La materia no existe");
            }
            
            preparedStatement.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!"+ex.getMessage());
        }
    }
    
    public void eliminarMateria(int idMateria){
        
        try {
            String deliteLogic = " UPDATE materia SET estado = 0 WHERE idMateria = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(deliteLogic);
            
            preparedStatement.setInt(1, idMateria);
            
            int esModificado = preparedStatement.executeUpdate();
            
            if(esModificado > 1){
                JOptionPane.showMessageDialog(null,"Materia eliminada");
            }else{
                JOptionPane.showMessageDialog(null,"La materia no existe!");
            }
            
            preparedStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia!");
        }
    
    }
    
    public ArrayList<Materia> listarMaterias(){
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        String listarMaterias = "SELECT * FROM materia WHERE estado = 1 ";
        
        try {
            
            PreparedStatement preparedStatement = connection.prepareStatement(listarMaterias);
            
            ResultSet resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
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
