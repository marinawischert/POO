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
public class Quadrado {

    private String cor;
    private double lado;
    private Ponto p;

    public Quadrado(String cor, double lado, int x, int y) {
        this.cor = cor;
        this.lado = lado;
        this.p = new Ponto(x, y);
    }

    public double perimetro() {
        double perimetro = lado * 4;

        return perimetro;
    }

    public double getArea() {
        double area = lado * lado;

        
        return area;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public Ponto getP() {
        return p;
    }

    public void setP(Ponto p) {
        this.p = p;
    }

}
