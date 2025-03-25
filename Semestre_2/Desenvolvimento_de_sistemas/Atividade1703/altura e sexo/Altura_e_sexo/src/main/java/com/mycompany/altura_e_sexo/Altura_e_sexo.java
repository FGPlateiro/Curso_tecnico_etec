/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.altura_e_sexo;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Altura_e_sexo {

    public static void main(String[] args) {
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo \n M para masculino e F para feminino");
        Float alturaflt;
        Float pesoflt;
        if ("m".equals(sexo)){
    String peso = JOptionPane.showInputDialog("Informe o seu peso");
    String altura = JOptionPane.showInputDialog("Digite a sua altura \n com virgula");
        alturaflt = Float.parseFloat(altura);
        pesoflt = Float.parseFloat(peso);
     if(alturaflt >= 1.8 && pesoflt >= 75){
    JOptionPane.showMessageDialog(null,"parbens você foi aceito");
    }else{
    JOptionPane.showMessageDialog(null, "Você nÃO FOI ACEITO");
    }
    }else {
            JOptionPane.showMessageDialog(null,"Não Aceito");
        }
    
    }
}
