/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplodowhile;

/**
 *
 * @author Aluno CA
 */
public class Exemplodowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

     int cont=1, r=0, num=5;
     System.out.println("Tabuada do N "+num);
     do{
      r = num*cont;   
     System.out.println(num+"X"+cont+"="+r);
     cont = cont+1;
     }
     while(cont <= 10);
     System.exit(0);
     }
    
}
