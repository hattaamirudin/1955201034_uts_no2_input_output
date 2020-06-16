/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.util.Scanner;

/**
 *
 * @author PERSONAL
 */
public class Ioscanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        System.out.println("TUGAS GAK KARUAN");
        int p,l,hasil;
        Scanner in = new Scanner (System.in);
        System.out.println("masukkan nilai panjang = ");
        p= in.nextInt();
        System.out.println("masukkan nilai lebar = ");
        l= in.nextInt();
        hasil = p*l;
        System.out.println("luas persegi panjang adalah = "+ hasil);
    }
    
    
}
