/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prueba.practicamanejoarchivos.entity;

import java.io.Serializable;

/**
 *
 * @author Sysco_Consultores
 */
public class Estudiante implements Serializable{
    private int idEstudinate;
    private String nombre;
    private int edad;
    private String correo;

    public Estudiante(int idEstudinate, String nombre, int edad, String correo) {
        this.idEstudinate = idEstudinate;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public int getIdEstudinate() {
        return idEstudinate;
    }

    public void setIdEstudinate(int idEstudinate) {
        this.idEstudinate = idEstudinate;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudinate=" + idEstudinate + ", nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + '}';
    }

   
    
}
