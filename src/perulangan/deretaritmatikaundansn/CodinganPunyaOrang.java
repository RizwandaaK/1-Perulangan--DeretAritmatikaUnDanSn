/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.deretaritmatikaundansn;

/**
 *
 * @author rizwa
 */
public class CodinganPunyaOrang {
    public static void main(String[] args) {
        
        int a=9;
        int b=4;
        int deret = a;
        int jumlah = 0;
        
        for(int n=2; n<=13; n++){
        deret = a + (n-1) *b;
        System.out.println("Suku ke-"+n+" = "+deret);
        
        jumlah+=deret;
    }
    }
}
