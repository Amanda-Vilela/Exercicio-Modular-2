/*
 * Fazer um programa que  apresente todos os valores pares na faixa 1000 a 1500.
 */
package pares_amanda;

import java.util.Scanner;

/**
 *
 * @Amanda Vilela
 */
public class Pares1000_Amanda {

    
    
    public static void main(String[] args)
    {
      System.out.println("Números pares na faixa de 1000 a 1500");
        int valor,i;      
        
         for (i=1000; i<=1500; i++)
        {
              valor = i % 2;
              if (valor == 0)
             {
        System.out.println("Os números pares são = " + i);
        
       }     
        
     }
  }
}
    

        
