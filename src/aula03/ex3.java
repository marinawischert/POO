/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author Marina
 */
public class ex3 {

    public static void main(String[] args) {
        Circulo c = new Circulo(5.0, "amarelo", 2, 0);
        Circulo c2 = new Circulo(3.9, "verde", 3, 1);
        System.out.println(c.area());
        System.out.println(c.perimetro());

        Quadrado q = new Quadrado("amarelo", 3.0, 0, 1);
        System.out.println(q.getArea());
        System.out.println(q.perimetro());
        Rectangulo r = new Rectangulo(2.0, 1.0, "verde", 0, 2);
        System.out.println(r.area());
        System.out.println(r.perimetro());

        if (c.Intercept(c2)) {
            System.out.println("Interceptam-se!");
        } else {
            System.out.println("Não se interceptam");
        }
    }
}
