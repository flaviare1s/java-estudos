package com.example.ExercicioRepeticao;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Scanner leitorScanner = new Scanner(System.in);
        
       char desejaContinuar = 'S';
       
       while(desejaContinuar == 'S' || desejaContinuar == 's' ) {
           
           System.out.println("Digite um número");
           int numero = leitorScanner.nextInt();
           
           if(numero == 0) {
               System.out.println("O numero eh zero!");
           } else {
               if(numero > 0) {
                   System.out.println("O numero eh positivo!");
               } else {
                   System.out.println("O numero eh negativo!");
               }
           }
           
          System.out.println("Deseja continuar? S - sim / N - nao");
          desejaContinuar = leitorScanner.next().charAt(0);
           
       }
        
    }
}
