package com.kendarg.Zoologico.model.Acciones.Animales;

import com.kendarg.Zoologico.model.Acciones.Caminar;


public class Perro extends Animal implements Caminar{
    public Perro(String nombre){
        super(nombre);
    }
    @Override
    public void caminar(){
        System.out.println(nombre + " Puede caminar por el parque");
    }
}
