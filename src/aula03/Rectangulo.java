/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

import aula01.Ponto;

/**
 *
 * @author Marina
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    private Ponto p;
    private String cor;

    public Rectangulo(double lado1, double lado2, String cor, int x, int y) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
        this.p=new Ponto(x,y);
    }

    public double perimetro(){
    double perimetro=lado1*2+lado2*2;
    return perimetro;
    }
    
    public double area(){
        double area=lado1*lado2;
        return area;
    }
    
    
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public Ponto getP() {
        return p;
    }

    public void setP(Ponto p) {
        this.p = p;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    
}
