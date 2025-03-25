/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadafor;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class TabuadaFor {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe o número para calculo da tabuada");
        Integer numerotabu = Integer.parseInt(numero);
        Integer resultado;
        for(int i = 1; i <= 10; i++){
        resultado = numerotabu * i;
        String Mensagem = numerotabu +"x"+ i +"="+resultado;
        JOptionPane.showMessageDialog(null, Mensagem);
        }
    }
}
