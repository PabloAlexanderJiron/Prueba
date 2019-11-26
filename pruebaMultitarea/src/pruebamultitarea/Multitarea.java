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
public class Multitarea extends Thread{
    private int[] ListaNumeros;
    private int NumLista;
    
    public Multitarea(int[] l,int n){
        ListaNumeros= l;
        NumLista= n;
    }
    public void run(){
        int Total = 0;
        for(int i =0; i<ListaNumeros.length;i++){
            Total += ListaNumeros[i];
            if((i%500000)==0)
                System.out.println("Hilo " + NumLista + " Subt: " + Total);           
        }
        System.out.println("Hilo " + NumLista + " Total: " + Total);
    }
}
