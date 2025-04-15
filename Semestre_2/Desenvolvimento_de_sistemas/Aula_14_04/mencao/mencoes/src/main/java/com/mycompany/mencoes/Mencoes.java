/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mencoes;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Mencoes {

    public static void main(String[] args) {
        String mencao[] = new String[4];
        String msg = "Digita sua menção \n MB - muito bom \n B - Bom \n R - Regular \n I - irregular";
        
        for(int i = 0; i<4;i++){
        mencao[i] = JOptionPane.showInputDialog(null, msg);
        }
        JOptionPane.showMessageDialog(null, Arrays.toString(mencao));
    }
}
