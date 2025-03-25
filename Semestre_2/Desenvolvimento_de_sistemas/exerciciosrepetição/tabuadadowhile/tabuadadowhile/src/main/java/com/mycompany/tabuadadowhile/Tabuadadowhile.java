/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadadowhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Tabuadadowhile {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Informe o numero \n para calculo da tabuada");
        Integer numerotabu = Integer.parseInt(numero);
        Integer resultado;
        Integer i = 1;
        
        do{
        resultado = numerotabu * i;
        String Mensagem = numerotabu +"x"+ i +"="+resultado;
        JOptionPane.showMessageDialog(null, Mensagem);
        i++;
        }while(i <= 10);
    }
}
