/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perulangan.deretaritmatikaundansn;
import java.util.Scanner;
/**
 *
 * @author rizwa
 */
public class CodinganSaya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("a                 : ");
        int a = input.nextInt();
        
        System.out.print("b                 : ");
        int b = input.nextInt();
        
        System.out.print("Suku ke-          : ");
        int sukupertama = input.nextInt();
        
        System.out.print("sampai Suku ke-   : ");
        int sukuterakhir = input.nextInt();
        
        int nilaipertama = a+(b*(sukupertama-1));
        int sukusaatini = nilaipertama;
        int jmlderet = nilaipertama;
        System.out.println("================================="+"\n"+
                           "             Jawaban             "+"\n"+
                           "=================================");
        System.out.println("Deret aritmatikanya sbb:");
        for (int i=sukupertama; i<=sukuterakhir; i++){
            System.out.println("Suku ke-"+i+" : "+sukusaatini);
            sukusaatini=sukusaatini+b;
            jmlderet=jmlderet+sukusaatini;
        }
        jmlderet=jmlderet-sukusaatini;
        System.out.println("---------------------------------+");
        System.out.println("Jumlah deret aritmatikanya (Sn) = "+jmlderet);
    }       
}
