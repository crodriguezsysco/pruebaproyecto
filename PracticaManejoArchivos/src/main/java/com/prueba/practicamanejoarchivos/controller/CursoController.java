/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.practicamanejoarchivos.controller;

import com.prueba.practicamanejoarchivos.entity.Curso;
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
public class CursoController {
    private static final String FILE_NAME = "curso.dat";
    private List<Curso> curso;

    public CursoController() {
        curso = new ArrayList<>();
        cargarDatos();
    }

    // Crear
    public void agregarCurso(Curso persona) {
        curso.add(persona);
        guardarDatos();
    }

    // Leer
    public List<Curso> obtenerCursos() {
        return curso;
    }

    // Actualizar
    public void actualizarCurso(int index, Curso nuevaCurso) {
        if (index >= 0 && index < curso.size()) {
            curso.set(index, nuevaCurso);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    // Borrar
    public void borrarCurso(int index) {
        if (index >= 0 && index < curso.size()) {
            curso.remove(index);
            guardarDatos();
        } else {
            System.out.println("Índice no válido");
        }
    }

    private void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            curso = (List<Curso>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado, se creará uno nuevo.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(curso);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
