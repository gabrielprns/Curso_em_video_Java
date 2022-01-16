/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula15ex2;

/**
 *
 * @author Usuario
 */
public class fatorial {
    private int num=0;
    private int fat=1;
    private String formula="";
    
    public void setValor(int n){
        num=n ;
        int fa=1;
        String s= "";
        for(int c=n; c>1; c--){
            fa*=c;
            s+= c + " X ";
                
        }
        s += "1= ";
        fat=fa;
        formula=s;
    
    }
    
     public int getFatorial(){
        return fat;
     
     }
     
     public String getFormula(){
         return formula ;
     
     }
}
