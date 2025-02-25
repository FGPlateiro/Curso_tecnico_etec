/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        {String st = "INFORME UM NÚMERO ENTRE 1 E 2";
        st= JOptionPane.showInputDialog(null, st);
        // conversão de string para int
        
        int mes = Integer.parseInt(st);
        switch(mes)
        { case 1:
                st = "pagamento em dia";
                break;
        case 2:
            st="PAGAMENTO ATRASADO";
            break;
        default:
            st = "DIA INVALIDO";
            JOptionPane.showMessageDialog(null, st,"erro",0);
            System.exit(0); }
        st= "VOCÊ ESCOLHEU O MÊS DE "+st;
        JOptionPane.showMessageDialog(null,st,"Mensage", 1); }
        System.exit(0);
            
            
                
        
    }
    
}
