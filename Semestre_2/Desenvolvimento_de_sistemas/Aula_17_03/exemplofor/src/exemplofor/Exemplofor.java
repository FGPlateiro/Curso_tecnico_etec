/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplofor;

/**
 *
 * @author Aluno CA
 */
public class Exemplofor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, num=0,r=0;
        System.out.println("Tabuada completa");
        
        for(i=0;i<=10;i++){
            for(num=1;num<=10;num++){
            r= i * num;
            System.out.println(i+"x"+num+"="+r);
            }
            
        }
        System.exit(0);
    }
    
}
