/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author PERSONAL
 */
public class iobufferedreader {
    public static void main(String[] args) throws IOException {

        String nama;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        System.out.println("Nama kamu adalah " + nama);

    }
  
}
