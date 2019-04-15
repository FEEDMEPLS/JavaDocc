/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 *La classe campana definice la Campana tramite il suo suono ed il numero di volte che suona.
 * @author Astori Michele
 */
public class Campana implements Runnable{
    String suono;
    int volte;
 /**
  * 
  * @param suono il suono della campana.
  * @param volte numero di volte che la campana suonerà.
  */
    public Campana(String suono,int volte){
        this.suono = suono;
        this.volte = volte;
    }
    /**
     * il metodo run ha il compito di stampare il numero di rintocchi e il tipo di suono della campana.
     */
    public void run(){
        for(int k = 0; k < volte; k++)
            System.out.println((k+1)+ suono+" ");
    }   
}
