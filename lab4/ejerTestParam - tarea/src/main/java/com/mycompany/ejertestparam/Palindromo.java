/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

/**
 *
 * @author Juan Carlos
 */
public class Palindromo {
    public boolean buscaPalindromo(String cadena) {
        cadena = cadena.toLowerCase();
        int largoCadena = cadena.length();
        System.out.println("el largo de la cadena es::" + cadena.length());
        boolean esPalindromo = true;
        int rango = largoCadena / 2;
        System.out.println("el rango es::" + largoCadena / 2);
        System.out.println("el modulo es::" + largoCadena % 2);
        if (largoCadena % 2 == 0) {
            rango--;
        }
        for (int i = 0; i < rango; i++) {
            if (cadena.charAt(i) != cadena.charAt(largoCadena - i - 1)) {
                esPalindromo = false;
            }
        }
        return esPalindromo;
    }
    
}
