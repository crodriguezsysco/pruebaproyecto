/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.prueba.practicamanejoarchivos;

import com.prueba.practicamanejoarchivos.controller.CursoController;
import com.prueba.practicamanejoarchivos.controller.CursoEstudianteController;
import com.prueba.practicamanejoarchivos.controller.EstudianteController;
import com.prueba.practicamanejoarchivos.entity.Curso;
import com.prueba.practicamanejoarchivos.entity.CursoEstudiante;
import com.prueba.practicamanejoarchivos.entity.Estudiante;
import java.util.List;

/**
 *
 * @author Sysco_Consultores
 * 21102024
 */
public class PracticaManejoArchivos {

    public static void main(String[] args) {
        EstudianteController estudianteController = new EstudianteController();
        CursoController cursoController = new CursoController();
        CursoEstudianteController cursoEstudianteController = new CursoEstudianteController();
        // Agregar personas
        estudianteController.agregarEstudiante(new Estudiante(1,"Alice", 30,"estudiante1@abc.com"));
        estudianteController.agregarEstudiante(new Estudiante(2,"Bob", 25,"estudiante2@abc.com"));

        // Leer personas
        System.out.println("Lista de personas:");
        for (Estudiante p : estudianteController.obtenerEstudiantes()) {
            System.out.println(p);
        }

        // Actualizar una persona
        estudianteController.actualizarEstudiante(0, new Estudiante(1,"Alice Updated", 31,"estudianteUpdated@abc.com"));

        // Borrar una persona
        estudianteController.borrarEstudiante(1);

        // Mostrar lista actualizada
        System.out.println("Lista de personas despues de actualizar y borrar:");
        for (Estudiante p : estudianteController.obtenerEstudiantes()) {
            System.out.println(p);
        }
        
        cursoController.agregarCurso(new Curso(1,"Desarrollo software"));
        cursoController.agregarCurso(new Curso(2,"Contabilidad"));
        
        cursoEstudianteController.agregarCursoEstudiante(new CursoEstudiante(1,1));
        
        
        List<CursoEstudiante> cursoEstudianteList = cursoEstudianteController.obtenerCursoEstudiantes();
        for (CursoEstudiante cursoEstudiante : cursoEstudianteList) {
            
        }
    }
}
