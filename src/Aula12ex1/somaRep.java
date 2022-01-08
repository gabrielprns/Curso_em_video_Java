/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula12ex1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class somaRep {
    public static void main(String[] args) {
        int n, s=0 ;
        Scanner teclado = new Scanner(System.in);
        String res;
        do{
            System.out.println("Digite um número ");
            n=teclado.nextInt();
            s+=n;
            System.out.println("Desja continuar? ");
            res=teclado.next();
        }while(res.equals("S"));
        System.out.println("A soma é igual a: " + s);
    }
    
}
