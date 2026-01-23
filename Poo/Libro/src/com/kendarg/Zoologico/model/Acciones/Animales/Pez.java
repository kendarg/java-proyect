package com.kendarg.Zoologico.model.Acciones.Animales;
import com.kendarg.Zoologico.model.Acciones.Nadar;



public class Pez extends Animal implements Nadar{

    public Pez(String nombre){
        super(nombre);
    }

    @Override
    public void nadar(){
        System.out.println(nombre + "Puede nadar por el parque");

    }
    
}
