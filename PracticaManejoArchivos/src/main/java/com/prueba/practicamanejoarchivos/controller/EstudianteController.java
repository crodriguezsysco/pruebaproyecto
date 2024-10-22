/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.practicamanejoarchivos.controller;

import com.prueba.practicamanejoarchivos.entity.Estudiante;
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
public class EstudianteController {
    
   private static final String FILE_NAME = "estudiantes.dat";
    private List<Estudiante> estudiantes;

    public EstudianteController() {
        estudiantes = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarEstudiante(Estudiante persona) {
        estudiantes.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Estudiante> obtenerEstudiantes() {
        return estudiantes;
    }

    // Actualizar
    public void actualizarEstudiante(int index, Estudiante nuevaEstudiante) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.set(index, nuevaEstudiante);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarEstudiante(int index) {
        if (index >= 0 && index < estudiantes.size()) {
            estudiantes.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            estudiantes = (List<Estudiante>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(estudiantes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
