/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INPUT_OUTPUT;

import javax.swing.JOptionPane;

/**
 *
 * @author PERSONAL
 */
public class jooptionpane {
    public static void main(String[] args){
        int g=-1;
        while(g<0){
            String input =JOptionPane.showInputDialog("siapa namamu:");
            if(input.length()>0){
                g++;
                System.out.println("terima kasih");
            }else 
                System.out.println("siapa nama anda!");
        }
    }
    
}
