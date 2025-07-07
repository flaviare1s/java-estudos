package com.example.EstruturasCondicionais;

public class App {

    public static void main(String[] args) {
        
        int media = 10;
        
        if(media >= 7) {
           if(media == 10) {
               System.out.println("Aprovado com nota maxima!");
           } else {
              System.out.println("Aprovado!"); 
           }
        } else {
           System.out.println("Reprovado!"); 
        }
        
    }
}
