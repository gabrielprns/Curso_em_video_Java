/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14ex1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class listas {
    public static void main(String[] args) {
        String res ;
        Scanner teclado = new Scanner(System.in);
        String messes [] ={"Jan", "Fev", "March"};
        int dias []= {31,28,31};
        System.out.println("Digite se ano será bisexto ou não, S para sim, N para não");
        res = teclado.next();
        if (res.equals("S")){
            dias[1]=29;
            for(int c=0; c<messes.length; c++){
            System.out.println("O mês de " + messes[c] + " tem " + dias[c] + " dias");
            }
        }else if(res.equals("N")){
            dias[1]=28;
            for(int c=0; c<messes.length; c++){
            System.out.println("O mês de " + messes[c] + " tem " + dias[c] + " dias");
            }
        }else{
            System.out.println("Resposta Inválida");
        }
        
    }
    
}
