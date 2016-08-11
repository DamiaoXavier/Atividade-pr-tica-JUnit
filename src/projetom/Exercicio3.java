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
 * @since  Release 03 da aplicação
 */
public class Exercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public class circulo{
        private int area;
        private int raio;
        private int diametro;
        
        public int getArea() {
            return area;
        }
        
        /** Método para retorno da area do circulo
         * 
         * @param r 
         */
       public void setArea(int r) {
            this.area = (int) (Math.PI * r);
        } 
       /**
        * 
        * @return 
        */
       public int getRaio() {
            return raio;
        }
        /**
         * 
         * @param d - "D" é o diametro da circulo 
         */
        public void setRaio(int d) {
            this.raio = d/2;
        }

        public int getDiametro() {
            return diametro;
        }
        /**
         * 
         * @param r - "R" raio da circunferência
         */
        public void setDiametro(int r) {
            this.diametro = 2*r;
        }
    }
    
}