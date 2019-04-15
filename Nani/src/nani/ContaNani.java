/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 *
 * La classe crea dei thread con il compito di contare i nani.
 * @author Astori Michele
 */
public class ContaNani extends Thread {

    ContaNani(String nome) {
        super();
        setName(nome);
    }
    
    /**
     * Il metodo run stampa 7 volte il nome del nano
     */
    public void run(){
        //System.out.println(Thread.currentThread().getName());
        for(int i = 0; i < 7; i++)
            System.out.println(i+1 + " " + getName());
        //System.out.println("Fine thread");
}
    
}
