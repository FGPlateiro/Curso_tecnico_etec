/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetor01;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Vetor01 {

    public static void main(String[] args) {
        String dados[] = new String[8];
        String st = "informe um dado de cada vez \n nesta sequencia \n Nome \n CPF \n celular \n idade \n endereço \n estado \n cidade \n CEP";
        
        for(int i = 0;i<8; i++){
        dados[i] = JOptionPane.showInputDialog(null,st);
        }
        JOptionPane.showMessageDialog(null,Arrays.toString(dados));
        
        
    }
}
