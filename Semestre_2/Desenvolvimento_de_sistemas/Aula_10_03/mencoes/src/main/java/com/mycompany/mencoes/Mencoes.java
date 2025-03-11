/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mencoes;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno CA
 */
public class Mencoes {

    public static void main(String[] args) {
        { String st = "Informe o número entre 1 e 4";
        st = JOptionPane.showInputDialog(null,st);
          int mencao = Integer.parseInt(st);
          switch(mencao)
          { case 1:
                  st = "MB - Muito Bom";
                  break;
            case 2:
                  st = "B - Bom";
                  break;
            case 3:
                  st = "R - Regular";
                  break;
            case 4:
                  st = "i - Irregular";
                  break;
            default:
           st = "Menção invalida";
            JOptionPane.showMessageDialog(null, st,"erro",0);
            System.exit(0); }
        st= "Você escolheu a menção "+st;
        JOptionPane.showMessageDialog(null,st,"Mensage", 1); }
        System.exit(0);
          }
        }
    

