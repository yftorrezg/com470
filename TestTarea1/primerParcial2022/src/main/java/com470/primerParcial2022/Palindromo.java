
package com470.primerParcial2022;

public class Palindromo {
    public boolean buscaPalindromo(String cadena){
        cadena=cadena.toLowerCase();
        System.out.println("la cadena es:::"+cadena);
        int largoCadena=cadena.length();
        System.out.println("El largo de la cadena es::"+cadena.length());
         boolean esPalindromo=true;
        int rango=largoCadena/2;
        System.out.println("El rango es::"+largoCadena/2);
        System.out.println("El modulo es"+largoCadena%2);
        if (largoCadena%2==0) {
            rango--;
        }
        for (int i = 0; i < rango; i++) {
            if (cadena.charAt(i)!=cadena.charAt(largoCadena-i-1)) {
                esPalindromo=false;
            }
        }
    return esPalindromo;
    }
}
