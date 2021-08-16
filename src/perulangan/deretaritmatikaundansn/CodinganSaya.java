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
public class CodinganSaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ini nilai di suku pertama
        int a = 14;
        // ini beda atau selisihnya
        int b = 4;
        // ini suku ke berapa yang mau ditampilkan di awal
        int sukupertama = 13;
        //ini suku ke berapa yang mau ditampilkan di akhir
        int sukuterakhir = 24;
        // ini nilai yang ditampilkan di suku terawal
        int nilaipertama = a+(b*(sukupertama-1));
        // ini rumusnya
        int sukusaatini = nilaipertama;
        int jmlderet = nilaipertama;
        System.out.println("Deret aritmatikanya yaitu:");
        for (int i=sukupertama; i<=sukuterakhir; i++){
            System.out.println(sukusaatini);
            sukusaatini=sukusaatini+b;
            jmlderet=jmlderet+sukusaatini;
        }
        jmlderet=jmlderet-sukusaatini;
        System.out.println("Jumlah deret aritmatikanya yaitu: "+jmlderet);
    }       
}
