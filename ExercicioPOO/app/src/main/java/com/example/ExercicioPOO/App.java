package com.example.ExercicioPOO;

public class App {
  
    public static void main(String[] args) {
        
        Invoice inv = new Invoice(1, "Mouse", 10, 50.0f);
        
        System.out.println("Valor total: " + inv.getInvoiceAmount());
        
        
    }
}
