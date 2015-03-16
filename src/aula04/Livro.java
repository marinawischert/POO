/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

/**
 *
 * @author Marina
 */
public class Livro {
    private int id;
    private String titulo;
    private String emprestimo;
    private boolean disponivel;

    public Livro(int id, String titulo, String emprestimo) {
        this.id = id;
        this.titulo = titulo;
        this.emprestimo = emprestimo;
        this.disponivel=true;
    }

    public int getId() {
        return id;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(String emprestimo) {
        this.emprestimo = emprestimo;
    }
       public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
}
