/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadenome;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class AtividadeNome {

    public static void main(String[] args) {
        String nome[] = new String[6];
        String st = "Digite letra por letra do seu nome";
        for(int i=0;i<6;i++){
        nome[i] = JOptionPane.showInputDialog(null,st);
        
        }
        System.out.println(Arrays.toString(nome));
    }
}
