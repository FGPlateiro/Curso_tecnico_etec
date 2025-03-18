/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicoidade;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class ExercicoIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String idade = JOptionPane.showInputDialog("Informe a sua idade");
       int maioridade = Integer.parseInt(idade);
       
       if(maioridade >= 18){
           JOptionPane.showMessageDialog(null,"Permitida a entrada");
       } else{
        JOptionPane.showMessageDialog(null,"Entrada não permitida");
    }
       System.exit(0);
    }
    
}
