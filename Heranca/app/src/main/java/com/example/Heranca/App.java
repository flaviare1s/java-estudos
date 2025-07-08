package com.example.Heranca;

import java.util.Date;

public class App {

    public static void main(String[] args) {
        
        Vendedor v = new Vendedor();
        v.setNome("Márcio");
        v.setSalario(1000.0f);
        v.setCpf("11111111111");
        v.setDataNascimento(new Date());
        v.setComissaoPorItem(10.0f);
        v.setTotalItensVendidos(10);
        
        System.out.println("O salario do vendedor eh: " + v.calcularSalario());
    }
}
