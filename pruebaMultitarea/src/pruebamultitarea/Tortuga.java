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
public class Tortuga extends Thread{
    public void run(){
        System.out.println("Comienza la tortuga ");
        for(int i =0; i<5; i++)
            try{
                Thread.sleep(5000);
                System.out.println("Tortuga " + i);
            }
        catch(Exception e){           
        }
        System.out.println("Finaliza la tortuga ");
    }
}
