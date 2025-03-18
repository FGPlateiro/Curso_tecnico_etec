/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicioavaliacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Exercicioavaliacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nota; 
        nota = JOptionPane.showInputDialog("Digite a sua nota");
        
      if((nota == "a") || (nota == "A")){
       JOptionPane.showMessageDialog(null, "Aprovado");
    }
      if((nota == "b") || (nota == "B")){
       JOptionPane.showMessageDialog(null, "Aprovado");
    }
      if((nota == "c") || (nota == "C")){
       JOptionPane.showMessageDialog(null, "Aprovado");
    }
      if((nota == "d") || (nota == "D")){
       JOptionPane.showMessageDialog(null, "Reprovado");
    }
      if((nota == "e") || (nota == "E")){
       JOptionPane.showMessageDialog(null, "Reprovado");
    } else {
      JOptionPane.showMessageDialog(null, "Opção Invalida");
      }
            
            
        }
    
    
}
