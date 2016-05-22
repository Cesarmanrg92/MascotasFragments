package com.cesarandroid.mascotasandroid.Pojo;

/**
 * Created by AhskaBay on 16/05/2016.
 */
public class Mascotas {

    private int imagen_animal;
    private int imagen_hueso;
    private int imagen_like;
    private String nombre;
    private String num_like;

    public Mascotas(int imagen_animal, int imagen_hueso, int imagen_like,  String nombre, String num_like){

        this.imagen_animal = imagen_animal;
        this.imagen_hueso = imagen_hueso;
        this.imagen_like = imagen_like;
        this.nombre = nombre;
        this.num_like = num_like;

    }

    public Mascotas(int imagen_animal,int imagen_like,String nombre,String num_like){

        this.imagen_animal = imagen_animal;
        this.imagen_like = imagen_like;
        this.nombre = nombre;
        this.num_like = num_like;


    }

    public int getImagen_animal() {
        return imagen_animal;
    }

    public void setImagen_animal(int imagen_animal) {
        this.imagen_animal = imagen_animal;
    }

    public int getImagen_hueso() {
        return imagen_hueso;
    }

    public void setImagen_hueso(int imagen_hueso) {
        this.imagen_hueso = imagen_hueso;
    }

    public int getImagen_like() {
        return imagen_like;
    }

    public void setImagen_like(int imagen_like) {
        this.imagen_like = imagen_like;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNum_like() {
        return num_like;
    }

   public void setNum_like(String num_like) {
        this.num_like = num_like;


   }


}
