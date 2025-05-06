/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0505_vetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Aula0505_vetor {

    public static void main(String[] args) {
        int V[][] = new int [2][2];
        String st = "Digite 4 numeros";
        for(int i = 0; i<2; i++)
        {for (int j=0; j<2; j++)
        {
        st = JOptionPane.showInputDialog(null,st);
        V[i][j]= Integer.parseInt(st);
        }
            }
        System.exit(0);
        
       
    }
}
