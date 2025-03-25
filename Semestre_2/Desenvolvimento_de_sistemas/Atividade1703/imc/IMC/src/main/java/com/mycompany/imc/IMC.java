/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class IMC {

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Informe o seu sexo");
        String altura = JOptionPane.showInputDialog("Informe a sua altura \n usando ponto como o exemplo abaixo \n 1.80");
        Float alturaflt = Float.parseFloat(altura);
        double resultado;
        if("m" .equals(sexo)){
        resultado = (72.7 * alturaflt)-58;
        String imchomem = "Seu IMC ideal é "+resultado;
        JOptionPane.showMessageDialog(null,imchomem);
        }if("f" .equals(sexo)){
        resultado = (62.1*alturaflt)-44.7;
        String imcmulher = "seu IMC ideal é: "+resultado;
        JOptionPane.showMessageDialog(null, resultado);
        }
        
    }
}
