/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12ex2;

import javax.swing.JOptionPane ;
/**
 *
 * @author Usuario
 */
public class optionPane {
 
    public static void main(String[] args) {
        int n, par = 0,impar=0 ,acima=0,  s=0, media, quant = 0 ;
        do{
            n=Integer.parseInt(JOptionPane.showInputDialog("Informe um Número, (Valor Imterrompe em 0)"));
            while(n%2==0){
            par++ ;
            break ;
            }
            
            while(n%2!=0){
            impar++ ;
            break ;
            }
            
            while(n>=100){
            acima++ ;
            break;
            }
            
            s +=n ;
            quant ++ ;
        }while(n!=0);
        media = s/quant ;
        JOptionPane.showMessageDialog(null, "<html> <br> A quantidade de números pares é:  " + par + "<br>"
                +"<br> A soma dos valores será igual a: " + s + "<br>"
                +"<br> A quantidade de números impares é: " + impar + "<br>" 
                +"<br> A quantidade de números acima de 100 é: " + acima + "<br>"
                +"<br> A média será igual a: " + media  + "<br><html>");
    }
           
    
}
