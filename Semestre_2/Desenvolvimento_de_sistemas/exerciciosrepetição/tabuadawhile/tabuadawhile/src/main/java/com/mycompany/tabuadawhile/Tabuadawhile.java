/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tabuadawhile;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Tabuadawhile {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("informe um número \n para calculo da tabuada");
        Integer numerotabu = Integer.parseInt(numero);
        Integer resultado;
        Integer i = 1;
        
        while(i <= 10){
        resultado = numerotabu * i;
        String Mensagem = numerotabu +"x"+ i +"="+resultado;
        JOptionPane.showMessageDialog(null, Mensagem);
        i++;
        }
    }
}
