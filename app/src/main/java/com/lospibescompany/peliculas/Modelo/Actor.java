package com.lospibescompany.peliculas.Modelo;

public class Actor {
    private String nombre;
    private String apellido;
    private String edad;
    private String genero;

    public Actor(String nombre, String apellido, String edad, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Actor{" + "nombre='" + nombre + '\'' + ", apellido='" + apellido + '\'' +
                ", edad='" + edad + '\'' + ", genero='" + genero + '\'' +
                '}';
    }
}
