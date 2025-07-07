package com.example.ExercicioCondicionais1;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        int numero;
        
        System.out.println("Digite um valor!");
        Scanner leitorScanner = new Scanner(System.in);
        
        numero = leitorScanner.nextInt();
        
        if(numero >= 100 && numero <= 200) {
            System.out.println("Numero estah no intervalo!");
        } else {
            System.out.println("Numero nao estah no intervalo!");
        }       
    }
}
