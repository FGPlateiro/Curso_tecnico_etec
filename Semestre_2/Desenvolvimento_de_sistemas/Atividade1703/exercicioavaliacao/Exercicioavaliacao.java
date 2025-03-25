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
        
    switch (nota) {
        case "a", "b","c" -> JOptionPane.showMessageDialog(null, "aprovado");
        case "d", "e" -> JOptionPane.showMessageDialog(null,"reprovado");
        default -> JOptionPane.showMessageDialog(null,"Nota invalida");
                
        }
    }
}
