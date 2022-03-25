/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 *
 * @author 2etimds
 */
public class exercicio1 {
     @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      String num;
      
      Scanner numdigitado = new Scanner(System.in);
      System.out.print("Escreva um número: ");
      num = numdigitado.nextLine();

      int centena = Integer.parseInt(String.valueOf(num.charAt(0)));
      int dezena = Integer.parseInt(String.valueOf(num.charAt(1)));
      int unidade = Integer.parseInt(String.valueOf(num.charAt(2)));
      
      
      String[] centena1 = {"","cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
      String[] dezena1 = {"","", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa",""};
      String[] dezena2 = {"dez","onze", "doze", "treze", "catorze", "quinze", "dezesseis", "dezesete", "dezoito", "dezenove", ""};
      String[] unidade1 = {"","um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", ""};
      
      System.out.println(centena1[centena]);
      
   }
 }


