package com.example.tabla_periodica;

public class Elemento_id {
    int Id;
    String nombre;
    String Url;
    public Elemento_id(int id, String nombre) {
        Id = id;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


}
