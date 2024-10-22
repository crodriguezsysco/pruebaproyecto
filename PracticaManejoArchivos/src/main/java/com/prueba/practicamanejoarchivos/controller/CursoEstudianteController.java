/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.practicamanejoarchivos.controller;

import com.prueba.practicamanejoarchivos.entity.CursoEstudiante;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sysco_Consultores
 */
public class CursoEstudianteController {
        private static final String FILE_NAME = "cursoEstudiante.dat";
    private List<CursoEstudiante> cursoEstudiante;

    public CursoEstudianteController() {
        cursoEstudiante = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarCursoEstudiante(CursoEstudiante persona) {
        cursoEstudiante.add(persona);
        guardarDatos();
    }

    // Leer
    public List<CursoEstudiante> obtenerCursoEstudiantes() {
        return cursoEstudiante;
    }

    // Actualizar
    public void actualizarCursoEstudiante(int index, CursoEstudiante nuevaCursoEstudiante) {
        if (index >= 0 && index < cursoEstudiante.size()) {
            cursoEstudiante.set(index, nuevaCursoEstudiante);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarCursoEstudiante(int index) {
        if (index >= 0 && index < cursoEstudiante.size()) {
            cursoEstudiante.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            cursoEstudiante = (List<CursoEstudiante>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(cursoEstudiante);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
