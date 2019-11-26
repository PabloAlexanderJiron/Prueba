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
public class Liebre implements Runnable{
    public void run(){
        System.out.println("Comienza la Liebre ");
        for(int j =0; j<5; j++)
            try{
                Thread.sleep(2000);                
                System.out.println("Liebre " + j);
            }
        catch(Exception e){           
        }
        System.out.println("Finaliza la Liebre ");
    }
}
