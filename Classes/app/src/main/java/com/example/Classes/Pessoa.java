package com.example.Classes;

public class Pessoa {
    
    // Atributos
    private float peso;
    private float altura;
    
    // Método construtor
    public Pessoa(float peso, float altura) {
        System.out.println("Executando o método construtor...");
        this.peso = peso;
        this.altura = altura;
    }
    
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
