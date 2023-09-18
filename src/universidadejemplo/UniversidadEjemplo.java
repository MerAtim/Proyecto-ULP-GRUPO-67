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
        //AlumnoData alu= new AlumnoData();
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
                
        //-------------------------------------------------------------------------------//
        //---------------------METODOS INSCRIPCION DATA----------------------//
        //-------------------------------------------------------------------------------//
        
        //guardarInscripcion();
        /*AlumnoData ad = new AlumnoData();
        MateriaData md = new MateriaData();
        InscripcionData id = new InscripcionData();
        Alumno alumno = ad.buscarAlumno(1);
        Materia mate = md.buscarMateria(1);
        Inscripcion insc = new Inscripcion(9, alumno, mate, true);
        id.guardarInscripcion(insc);*/
        
        //obtenerInscripciones();
        /*InscripcionData id = new InscripcionData();
        for(Inscripcion insc:id.obtenerInscripciones()){
        System.out.println(insc.toString());
        }*/
        
        //obtenerInscripcionesPorAlumno();
        /*InscripcionData id = new InscripcionData();
        for(Inscripcion insc:id.obtenerInscripcionesPorAlumno(1)){
        System.out.println(insc.toString());
        }*/
        
        //obtenerMateriasCursadas();
        /*InscripcionData id = new InscripcionData();
        for(Materia mate:id.obtenerMateriasCursadas(1)){
        System.out.println(mate.toString());
        }*/
        
        //obtenerMateriasNoCursadas();
        /*InscripcionData id = new InscripcionData();
        for(Materia mate:id.obtenerMateriasNoCursadas(2)){
        System.out.println(mate.toString());
        }*/
        
        //borrarInscripcionMateriaAlumno();
        /*InscripcionData id = new InscripcionData();
        id.borrarInscripcionMateriaAlumno(3, 1);*/
        
        //actualizarNota();
        /*InscripcionData id = new InscripcionData();
        id.actualizarNota(3, 2, 6);*/
        
        //obtenerAlumnosPorMateria();
        /*InscripcionData id = new InscripcionData();
        for(Alumno alum:id.obtenerAlumnosPorMateria(2)){
        System.out.println(alum.toString());
        }*/
        
    }
}
