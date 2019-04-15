/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nani;

/**
 * Il programma stampa 7 volte il nome dei nani. 
 * @author Astori Michele
 */
public class Nani {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        ContaNani thr1 = new ContaNani("brontolo");
        ContaNani thr2 = new ContaNani("mammolo");
        ContaNani thr3 = new ContaNani("pisolo");
        ContaNani thr4 = new ContaNani("dotto");
        ContaNani thr5 = new ContaNani("eolo");
        ContaNani thr6 = new ContaNani("cucciolo");
        ContaNani thr7 = new ContaNani("gongolo");
        thr1.start();
        Thread.sleep(1000);
        thr2.start();
        Thread.sleep(1000); 
        thr3.start();
        Thread.sleep(1000);
        thr4.start();
        Thread.sleep(1000);
        thr5.start();
        Thread.sleep(1000);
        thr6.start();
        Thread.sleep(1000);
        thr7.start();
        //System.out.println(Thread.currentThread().getName());
    }
    
}
