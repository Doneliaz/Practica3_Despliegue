package com.example.Mate;

public class Operaciones {
    int numero1;
    int numero2;
    String operacion;
    
    public Operaciones(int numero1, int numero2, String operacion) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacion = operacion;
    }
    
    public int suma() {
        return numero1 + numero2;
    }
    
    public int resta() {
        return numero1 - numero2;
    }
    
    public int multiplicacion() {
        return numero1 * numero2;
    }
    
    public int division() {
        return numero1 / numero2;
    }
    
    public int calcular() {
        switch (operacion) {
            case "+":
                return suma();
            case "-":
                return resta();
            case "*":
                return multiplicacion();
            case "/":
                return division();
            default:
                return 0;
        }
    }
    
}