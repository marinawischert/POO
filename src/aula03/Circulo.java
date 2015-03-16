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
public class Circulo {

    private Ponto p;
    private double raio;
    private String cor;

    public Circulo(double raio, String cor, int x, int y) {
        this.p = new Ponto(x, y);
        this.raio = raio;
        this.cor = cor;
    }

    public double perimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public double area() {
        double area = Math.PI * (raio * raio);
        return area;
    }

    public boolean Intercept(Circulo c2) {
        double distancia = Math.sqrt((p.getX() - c2.getP().getX())
                * (p.getX() - c2.getP().getX()) + (p.getY() - c2.getP().getY())
                * (p.getY() - c2.getP().getY()));
        if (Math.abs((raio - c2.getRaio())) <= distancia && distancia <= (raio + c2.getRaio())) {
            System.out.println(distancia);
            return true;
        } else {
            return false;
        }
    }

    public Ponto getP() {
        return p;
    }

    public void setP(Ponto p) {
        this.p = p;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

}
