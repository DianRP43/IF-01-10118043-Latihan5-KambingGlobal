/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118043.latihan5.kambingglobal;

/**
 *
 * @author user
 */
public class PBO110118043Latihan5KambingGlobal {

    /**
     * @param args the command line arguments
     */
    int jk = 88;
    public void getjk(){
        System.out.println("Jumlah Kambing: " +jk);
                
    }
    public void tk(){
        jk = jk + 5 ;
        System.out.println("Jumlah Kambing Setelah ditambah: " +jk);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        PBO110118043Latihan5KambingGlobal ks = new PBO110118043Latihan5KambingGlobal();
        
        ks.getjk();
        
        ks.tk();
        
        ks.getjk();
    }
    
}
