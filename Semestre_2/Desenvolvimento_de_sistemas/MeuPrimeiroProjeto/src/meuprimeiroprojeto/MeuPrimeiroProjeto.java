/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meuprimeiroprojeto;

/**
 *
 * @author Aluno CA
 */
public class MeuPrimeiroProjeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Soma s = new Soma();
        System.out.println(s.calcula(10, 5));
        
        System.out.println("");
        
        Divisao d = new Divisao();
        System.out.println(d.calcula(50, 2));
        
        System.out.println("");
        
        Multi m = new Multi();
        System.out.println(m.calcula(10, 10));
        
        System.out.println("");
        
        Subtracao s1 = new Subtracao();
        System.out.println(s1.calcula(50, 20));
        
    }
    
    
    
    
    
    
    
}
