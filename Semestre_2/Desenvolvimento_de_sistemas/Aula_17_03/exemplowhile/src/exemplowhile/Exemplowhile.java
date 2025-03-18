/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplowhile;

/**
 *
 * @author Aluno CA
 */
public class Exemplowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1, r=0, num=5;
        
        System.out.println("resultado"+ num);
        while(cont <= 10)
        {r=num*cont;
        System.out.println(num+"x"+cont+"="+r);
        cont = cont+1;}
        System.exit(0);
    }
    
}
