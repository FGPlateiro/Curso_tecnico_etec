/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0505_vetor2;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Aula0505_vetor2 {

    public static void main(String[] args) {
        int v[][] = new int [2][2];
       int n;
       String st = "digite o numero para alterar";
       st = JOptionPane.showInputDialog(null, st);
       n = Integer.parseInt(st);
       for(int i=0; i<2; i++){
       for(int j=0; j<2; j++){
       if(v[i][j] == n){
       st = "Digite um novo numero";
       JOptionPane.showMessageDialog(null, st);
       v[i][j] =Integer.parseInt(st);
       }
       }
       System.exit(0);
       }

    }
}
