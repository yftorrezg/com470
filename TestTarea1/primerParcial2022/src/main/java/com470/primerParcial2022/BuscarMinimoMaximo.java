package com470.primerParcial2022;

import java.util.List;

import com470.primerParcial2022.model.MinimoMaximo;



public class BuscarMinimoMaximo {
    
    public MinimoMaximo buscaMinimoMaximo(List<Integer> lista){
        int smallest=lista.get(0);
        int largest=lista.get(0);
        System.out.println("la lista es "+lista.toString());
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i)<smallest) smallest = lista.get(i);
            if(lista.get(i)> largest) largest = lista.get(i);
        }
        System.out.println("el menor es::"+smallest);
        System.out.println("el mayor es::"+largest);
        return new MinimoMaximo(smallest,largest);
    
    }
    
}
