package com.tt1.test;

import java.util.Date;

public class ToDo {
    private String nombre;
    private String descripcion;
    private String fecha;
    private Boolean completado;
    public ToDo(String n, String d, String f, Boolean c){
        this.nombre=n;
        this.descripcion=d;
        this.fecha=f;
        this.completado=c;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String n){
        this.nombre=n;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String n){
        this.descripcion=n;
    }
    public String getFecha(){
        return this.fecha;
    }
    public void setFcha(String n){
        this.fecha=n;
    }

    public void setCompletado(Boolean n){
        this.completado=n;
    }
    public Boolean getCompletado(){
        return this.completado;
    }

}
