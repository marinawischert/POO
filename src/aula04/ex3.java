/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Marina
 */
public class ex3 {

    static Scanner sc = new Scanner(System.in);
    static List<Aluno> lista = new ArrayList<>();
    static List<Livro> biblioteca = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int choice;
        do {
            System.out.println("1-inscrever aluno");
            System.out.println("2-remover aluno");
            System.out.println("3-imprimir lista de utilizadores");
            System.out.println("4-registar um novo livro");
            System.out.println("5-imprimir lista de livros");
            System.out.println("6-emprestar");
            System.out.println("7-devolver");
            System.out.println("8-verificar disponibilidade");
            System.out.println("9-sair");
            System.out.print("Opção-> ");

            choice = sc.nextInt();
            sc.nextLine();
            System.out.println();
        } while (choice < 1 || choice > 9);

        switch (choice) {
            case 1:
                inscreverAluno();
            case 2:
                removerAluno();
            case 3:
                listarUtilizadores();
            case 4:
                registarLivro();
            case 5:
                listarLivros();
            case 6:
                emprestarLivro();
            case 7:
                devolverLivro();
            case 8:
                verificarDisponibilidade();
            case 9:
                System.exit(1);
        }

    }

    public static void inscreverAluno() {

        System.out.println("Nome do aluno: ");
        String nome = sc.nextLine();
        System.out.println("Numero mecanográfico: ");
        String mec = sc.nextLine();
        System.out.println("Curso do aluno: ");
        String curso = sc.nextLine();

        Aluno aluno = new Aluno(mec, nome, curso);
        lista.add(aluno);

        System.out.println("Aluno inscrito com sucesso!");
        menu();
    }

    public static void removerAluno() {
        System.out.println("Número mecanográfico que pretende remover: ");
        String mec = sc.nextLine();

        for (Aluno a : lista) {
            if (a.getMec().equals(mec)) {
                lista.remove(a);
                System.out.println("Aluno removido com sucesso!");
                menu();
            }
        }

        System.out.println("Aluno não existe!");
        menu();
    }

    public static void listarUtilizadores() {
        if (lista.isEmpty()) {
            System.out.println("Não há alunos!");
        } else {
            for (Aluno a : lista) {
                System.out.println("Nome: " + a.getNome());
                System.out.println("Número mecanográfico: " + a.getMec());
                System.out.println("Curso: " + a.getCurso());
            }

        }
        menu();
    }

    public static void registarLivro() {
        String emprestimo;
        System.out.println("ID do livro: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Titulo do livro: ");
        String titulo = sc.nextLine();
        do {
            System.out.println("Tipo de emprestimo: ");
            emprestimo = sc.nextLine();
        } while (!emprestimo.equalsIgnoreCase("Condicional") && !emprestimo.equalsIgnoreCase("Normal"));

        Livro livro = new Livro(id, titulo, emprestimo);
        biblioteca.add(livro);
        System.out.println("Adicionado com sucesso !");
        menu();
    }

    public static void listarLivros() {
        if (biblioteca.isEmpty()) {
            System.out.println("Não existem livros !");

        } else {
            for (Livro l : biblioteca) {
                System.out.println("ID: " + l.getId());
                System.out.println("Titulo: " + l.getTitulo());
                System.out.println("Tipo de emprestimo: " + l.getEmprestimo());
                System.out.println("Disponibilidade: " + l.isDisponivel());

            }
        }
        menu();

    }

    public static void emprestarLivro() {
        System.out.println("Numero mecanográfico do aluno: ");
        String mec = sc.nextLine();
        Aluno aluno = null;
        for (Aluno a : lista) {
            if (!a.getMec().equals(mec)) {
                System.out.println("Aluno não existe ! \n");
                menu();
            } else {
                aluno = a;
            }
        }
         if(aluno.getLivros().size()==3){
            System.out.println("O aluno não pode pedir mais livros ! ! \n");
            menu();
        }
 
        System.out.println("ID do livro: ");
        
        int id = sc.nextInt(); 
        for (Livro livro : biblioteca) {
            if(id!=livro.getId() || !livro.isDisponivel()){
                System.out.println("O livro não existe ou não está disponível ! \n");
            }
            else if (id == livro.getId() && livro.isDisponivel()) {
                aluno.addLivro(livro);
                livro.setDisponivel(false);
                System.out.println("Livro emprestado com sucesso ! \n");
            }
        }
        
        menu();
    }
    
    public static void devolverLivro(){
        System.out.println("Número mecanográfico do aluno: ");
        String mec=sc.nextLine();
        Aluno aluno=null;
        
         for (Aluno a : lista) {
            if (!a.getMec().equals(mec)) {
                System.out.println("Aluno não existe ! \n");
                menu();
            } else {
                aluno = a;
            }
        }
         
         if(aluno.getLivros().size()==0){
             System.out.println("Aluno não tem livros para devolver \n");
             menu();
         }
         
         System.out.println("ID do livro: ");
         int id = sc.nextInt();
         
         for(Livro livro: biblioteca){
             if(livro.getId()!=id){
                 System.out.println("O livro não existe !");
                 menu();
             } 
             else{
                 aluno.getLivros().remove(livro);
                 livro.setDisponivel(true);
                 System.out.println("Remover livro ! ");
                 menu();
             }
         }
         
    }
    
    public static void verificarDisponibilidade(){
        System.out.println("ID do livro: ");
        int id= sc.nextInt();
        
        for(Livro livro: biblioteca){
        if(livro.getId()!=id){
            System.out.println("O livro não existe !");
            
        }else{
            System.out.print("Disponibilidade: "+livro.isDisponivel());
            
        }
        }
        menu();
    }
    
    
}
