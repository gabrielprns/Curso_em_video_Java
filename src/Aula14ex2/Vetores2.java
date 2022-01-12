/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14ex2;

import java.util.Arrays;

/**
 *
 * @author Usuario
 */
public class Vetores2 {
    public static void main(String[] args) {
        double v[]= {3.5, 5.7, 3.1, 2.7, 8.9};
        Arrays.sort(v);
        for(double valor:v){
            System.out.println(valor);
        }
    }
    
}
