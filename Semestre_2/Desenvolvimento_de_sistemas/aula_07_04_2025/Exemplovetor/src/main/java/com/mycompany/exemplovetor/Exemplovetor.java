/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemplovetor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Exemplovetor {

    public static void main(String[] args) {
        int v []= new int[2];
        String st = "Digite 2 numeros";
        for(int i=0; i<2; i++){
        st = JOptionPane.showInputDialog(null, st);
        v[i] = Integer.parseInt(st);
        }
        JOptionPane.showMessageDialog(null, v);
        System.exit(0);
    }
}
