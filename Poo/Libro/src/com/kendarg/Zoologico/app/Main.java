package com.kendarg.Zoologico.app;
import com.kendarg.Zoologico.model.Acciones.Animales.Perro;
import com.kendarg.Zoologico.model.Acciones.Animales.Pajaro;
import com.kendarg.Zoologico.model.Acciones.Animales.Pez;
import com.kendarg.Zoologico.model.Acciones.Animales.Pato;


public class Main {
    public static void main(String[] args){
        Perro perro = new Perro("Manolo");
        Pato pato = new Pato("Lucas");
        Pez pez = new Pez("Nemo");
        Pajaro pajaro = new Pajaro("Kala");

        perro.caminar();
        pez.nadar();
        pajaro.volar();
        pato.caminar();
        pato.nadar();
        pato.volar();
    }
}
