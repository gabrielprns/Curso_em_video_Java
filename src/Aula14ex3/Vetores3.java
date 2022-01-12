/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula14ex3;

import static java.util.Arrays.binarySearch;

/**
 *
 * @author Usuario
 */
public class Vetores3 {
    public static void main(String[] args) {
        int vet[]= {2,7,1,8,6};
        int p = binarySearch(vet, 8);
        System.out.println(p);
    }
    
}
