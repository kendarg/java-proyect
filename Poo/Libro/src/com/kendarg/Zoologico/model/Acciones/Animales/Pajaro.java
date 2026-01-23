package com.kendarg.Zoologico.model.Acciones.Animales;
import com.kendarg.Zoologico.model.Acciones.Volar;


public class Pajaro extends Animal implements Volar{
    public Pajaro(String nombre){
        super(nombre);
    }

    @Override
    public void volar(){
        System.out.println(nombre + " Puede volar por el parque");
    }
}
