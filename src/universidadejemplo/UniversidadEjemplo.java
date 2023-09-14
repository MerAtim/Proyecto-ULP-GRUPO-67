package universidadejemplo;

import javax.swing.JOptionPane;
import java.sql.*;
import java.time.LocalDate;
import universidadejemplo.AccesoADatos.*;
import universidadejemplo.Entidades.*;

public class UniversidadEjemplo {

    public static void main(String[] args) {

        //------------------------------------------------------------------------------//
        //----------------------METODOS ALUMNO DATA--------------------------//
        //-----------------------------------------------------------------------------//
        
        //guardarAlumno();
        //Alumno mario = new Alumno(7, 65325120, "Flores","Luis Mario", LocalDate.of(1991, 10, 25), true);
        AlumnoData alu= new AlumnoData();
        /*alu.guardarAlumno(mario);*/
        
        //buscarAlumno();
        /*Alumno alumnoEncontrado = alu.buscarAlumno(6);
        System.out.println("El alumno encontrado es: \n" + alumnoEncontrado.toString());*/
        
        //buscarAlumnoPorDni();
        /*Alumno alumnoEncontrado = alu.buscarAlumnoPorDni(38321654);
        System.out.println("El alumno encontrado es: \n" + alumnoEncontrado.toString());*/
        
        //listarAlumnos();
        /*for(Alumno alumnos:alu.listarAlumnos()){
            System.out.println(alumnos.toString());
        }*/
                     
        //modificarAlumno
        /* alu.modificarAlumno(mario);*/
        
        //eliminarAlumno
        /*alu.eliminarAlumno(7);*/
                
        //------------------------------------------------------------------------------//
        //--------------------METODOS INSCRIPCION DATA----------------------//
        //-----------------------------------------------------------------------------//
        
        // guardarInscripcion();
        /*AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
       
        Alumno alumno = ad.buscarAlumno(1);
        Materia mate = md.buscarMateria(1);
        Inscripcion insc = new Inscripcion(9, alumno, mate, true);
        id.guardarInscripcion(insc);*/
    }
}
