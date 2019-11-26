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
public class Carrera {
    public static void main(String[] args) {
        Tortuga t = new Tortuga();
        Thread l = new Thread (new Liebre());
        t.start();
        l.start();
    }
}
