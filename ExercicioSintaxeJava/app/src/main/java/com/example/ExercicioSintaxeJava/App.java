package com.example.ExercicioSintaxeJava;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        int anoFabricacao = 0;
        float valorCarro = 0.0f;
        float porcentagemDesconto = 0.00f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        int totalCarrosSemiNovos = 0;
        int totalCarros =0;
        
        char desejaRepetir = 's';
        
        Scanner leitor = new Scanner(System.in);
        
        while(desejaRepetir == 's' || desejaRepetir == 'S') {
            
            System.out.println("Digite o ano de fabricacao do veiculo");
            anoFabricacao = leitor.nextInt();
            System.out.println("Digite o valor do veiculo");
            valorCarro = leitor.nextFloat();
            
            if(anoFabricacao <= 2000) {
                porcentagemDesconto = 0.12f;
            } else {
                porcentagemDesconto = 0.007f;
                totalCarrosSemiNovos++;
            }
            
            totalCarros++;
            
            valorDesconto = valorCarro * porcentagemDesconto;
            valorPagar = valorCarro - valorDesconto;
            
            System.out.println("Desconto: " + valorDesconto);
            System.out.println("Valor a pagar: " + valorPagar);
            
            System.out.println("Deseja repetir a operacao? S - sim / N - nao");
            desejaRepetir = leitor.next().charAt(0);
            
        }
        
        System.out.println("Total de carros semi novos: " + totalCarrosSemiNovos);
        System.out.println("Total de carros: " + totalCarros);
        
    }
}
