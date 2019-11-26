/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamultitarea;

/**
 *
 * @author Pablo
 */
public class PruebaMultitarea {

    /**
     * @param args the command line arguments
     */
    public static int[] Generar(int num){
        int[] Lista = new int[num];
        for(int i =0; i<num;i++)
            Lista[i] = (int) (Math.random()*100);
        return Lista;
    }
    public static void main(String[] args) {
        int[]l1= Generar(10000000);
        int[]l2= Generar(20000000);
        
        Multitarea m1 = new Multitarea(l1, 1);
        Multitarea m2 = new Multitarea(l2, 2);
        m1.start();
        m2.start();
    }
    
}
