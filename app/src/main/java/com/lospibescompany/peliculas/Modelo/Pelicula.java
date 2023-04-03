package com.lospibescompany.peliculas.Modelo;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String descripcion;
    private String imagen;

    private String director;

    private String actorPrinc;

    public Pelicula(String titulo, String descripcion, String imagen, String director, String actorPrinc) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.director = director;
        this.actorPrinc = actorPrinc;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getActorPrinc() {return actorPrinc;}

    public void setActorPrinc(String actorPrinc) {this.actorPrinc = actorPrinc;}


}