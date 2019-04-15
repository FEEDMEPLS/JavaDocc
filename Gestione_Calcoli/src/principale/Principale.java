/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principale;

/**
 * Il programma ha il compito di assegnare un numero variabile di thread, ogni thread aggiungerà 1 alla variabile globale.
 * Al termine stampa il valore della variabile globale.
 * @author Astori Michele
 */
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GestCalcoli GC = new GestCalcoli();
        GC.setRisultato(0);
        System.out.println(GC.getRisultato());
        
        int v[] = new int [10];
        
        for(int i = 0; i < 10; i++){
            new Thread((Runnable) new CalcoloEdInserisco(1,GC)).start();
            v[i] = i;
        }
            
        
        while(Thread.activeCount()>1)
            System.out.println(Thread.activeCount());
        
        System.out.println("Ora ho concluso");
        System.out.println(Thread.activeCount());
        System.out.println("Risultato finale: "+GC.getRisultato());
    }
    
}
