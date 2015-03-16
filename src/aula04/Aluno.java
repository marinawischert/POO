/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marina
 */
public class Aluno {
    private String mec;
    private String nome;
    private String curso;
    private List <Livro> livros;
    
    
    public Aluno(String mec, String nome, String curso) {
        this.mec = mec;
        this.nome = nome;
        this.curso = curso;
        this.livros=new ArrayList<>();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public String getMec() {
        return mec;
    }

    public void setMec(String mec) {
        this.mec = mec;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public void addLivro(Livro l){
        this.livros.add(l);
    }
    
   
}
