package com.kendarg.Zoologico.model.Acciones.Animales;
import com.kendarg.Zoologico.model.Acciones.Caminar;
import com.kendarg.Zoologico.model.Acciones.Nadar;
import com.kendarg.Zoologico.model.Acciones.Volar;

public class Pato extends Animal implements Volar, Caminar, Nadar{
    public Pato(String nombre){
        super(nombre);
    }

    @Override
    public void volar(){
        System.out.println(nombre + "Puede volar por el parque");
    }

    @Override
    public void caminar(){
        System.out.println(nombre + "Puede caminar por el parque");
    }


    @Override
    public void nadar(){
        System.out.println(nombre + "Puede nadar por el parque");
    }

}