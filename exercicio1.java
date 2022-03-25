/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.util.Scanner;

/**
 *
 * @author 2etimds
 */

public class exercicio1 {
     {
    public static void main(String[] args) {
      program();
    }
      public static void extenso(String a, int b){
        String[][] unidade = {
            {"","", "", ""},
            
            {"onze","um", "dez", "cento"}, 
            
            {"doze", "dois", "vinte", "duzentos"},
            
            {"treze", "três", "trinta", "trezentos"}, 
            
            {"quatorze", "quatro", "quarenta", "quatrocentos"},
            
            {"quinze", "cinco", "cinquenta", "quinhentos"}, 
            
            {"dezesseis", "seis", "sessenta", "seiscentos"}, 
            
            {"dezesete", "sete", "setenta", "setecentos"}, 
            
            {"dezoito", "oito", "oitenta", "oitocentos"}, 
            
            {"dezenove", "nove", "noventa", "novecentos"} 
        };
        System.out.print(unidade[ Integer.parseInt((a)) ][b]); 
    }
    public static void program(){
        String num;
        try (Scanner leitor = new Scanner(System.in)) {
            System.out.println("Digite um número");
            num = leitor.nextLine();
        }
        
        String cen = "",
                dez = "",
                uni = "";

        uni += num.charAt(num.length() - 1);

        if(num.length() > 2){ 
            cen += num.charAt( num.length() - 3 ); 
            if(num.charAt( num.length() - 3 ) != '0'){ 
                extenso(cen, 3);
                System.out.print(" e ");

            }
        }
        
        if(num.length() > 1){ 
            dez += num.charAt( num.length() - 2); 
            if(num.charAt( num.length() - 2) != '0') { 
                if(num.charAt( num.length() - 2) == '1') 
                    extenso(uni, 0);
                else{
    
                    extenso(dez, 2);
                    System.out.print(" e ");
                }
            }
        }
        
        try {
            if(num.charAt( num.length() - 2) != '1')
            extenso(uni, 1);
        } catch (Exception e) {
            extenso(uni, 1);
        }
        
    }
}