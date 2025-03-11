/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.canais;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Canais {

    public static void main(String[] args) {
        String st= "Digite o número do canal desejado "
                + " canal \n 2 - cultura \n 4 - SBT \n 5 - Globo"
                + "\n 7 - Record \n 9 - Manchete \n "
                + "11 - Gazeta \n 13 - Bandeirante";
        st= JOptionPane.showInputDialog(null,st);
        
        int canal= Integer.parseInt(st);
        switch(canal){
            case 2 -> st = "2 - Cultura";
            case 4 -> st = "4- SBT";
            case 5 -> st = "5 - Globo";
            case 7 -> st = "7 - Record";
            case 9 -> st = "9 - Manchete";
            case 11 -> st = "11 Gazeta";
            case 13 -> st = "13 - Bandeirantes";
            default -> {
            st = "Canal invalido";
            JOptionPane.showMessageDialog(null, st,"erro",0);
            System.exit(0); }
            }
        st= "Você escolheu o canal "+st;
        JOptionPane.showMessageDialog(null,st,"Mensage", 1); 
        System.exit(0);
    }
}


    

