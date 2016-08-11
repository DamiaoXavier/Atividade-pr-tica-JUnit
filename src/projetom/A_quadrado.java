/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetom;

/**
 *
 * @author damião Xavier && Edilson Bernardo
 * @version 1.0 
 * @since  Release 04 da aplicação
 */
public class A_quadrado {

    /**
     * @param args the command line arguments
     */
    
    public static int base;
    public static int area;
    public static int altura;

    public static int getBase() {
        base = altura;
        return base;
    }

    public static void setBase(int base) {
        A_quadrado.base = base;
    }

    public static int getArea(int base, int altura) {
        area = base * altura;
        return area;
    }

    public static void setArea(int area) {
        A_quadrado.area = area;
    }

    public static int getAltura() {
        altura = base;
        return altura;
    }

    public static void setAltura(int altura) {
        A_quadrado.altura = altura;
    }
}