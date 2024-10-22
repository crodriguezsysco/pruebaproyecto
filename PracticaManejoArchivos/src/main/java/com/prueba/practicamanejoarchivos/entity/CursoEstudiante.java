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
public class CursoEstudiante implements Serializable{
    
    private int idCurso;
    private int idEstudiante;

    public CursoEstudiante(int idCurso, int idEstudiante) {
        this.idCurso = idCurso;
        this.idEstudiante = idEstudiante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    @Override
    public String toString() {
        return "CursoEstudiante{" + "idCurso=" + idCurso + ", idEstudiante=" + idEstudiante + '}';
    }
    
    
    
    
}
