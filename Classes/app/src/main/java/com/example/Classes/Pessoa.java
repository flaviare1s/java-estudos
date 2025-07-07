package com.example.Classes;

public class Pessoa {
    
    // Atributos
    private float peso;
    private float altura;
    
    // Métodos
    public float calcularIMC() {
        float imc = peso / (altura * altura);
        return imc;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso(float peso) {
        return peso;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura(float altura) {
        return altura;
    }
    
}
