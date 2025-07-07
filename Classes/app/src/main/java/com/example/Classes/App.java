
package com.example.Classes;
import java.util.Scanner;

public class App {
    
    

    public static void main(String[] args) {
        
        Pessoa objetoPessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso: ");
        objetoPessoa.peso = leitor.nextFloat();
        
        System.out.println("Digite a altura: ");
        objetoPessoa.altura = leitor.nextFloat();
        
        System.out.println("IMC: " + objetoPessoa.calcularIMC());
          
    }
}
