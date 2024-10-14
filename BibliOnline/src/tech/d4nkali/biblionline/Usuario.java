package tech.d4nkali.biblionline;

import java.util.ArrayList;
import java.util.List;

class Usuario {

    private String nomeUsuario;
    private List<Livro> livrosEmprestados;

    public Usuario(String nomeUsuario) {

        this.nomeUsuario = nomeUsuario;
        this.livrosEmprestados = new ArrayList<>();

    }

    public void emprestarLivro(Biblioteca biblioteca, Livro livro) {

        if (biblioteca.removerLivro(livro)) {

            livrosEmprestados.add(livro);
            System.out.println(nomeUsuario + " emprestou o livro: " + livro.getTitulo());

        } 

        else {
            System.out.println("Livro não disponível para empréstimo.");
        }

    }

    public void devolverLivro(Biblioteca biblioteca, Livro livro) {

        if (livrosEmprestados.remove(livro)) {

            biblioteca.adicionarLivro(livro);
            System.out.println(nomeUsuario + " devolveu o livro: " + livro.getTitulo());

        } 

        else {
            System.out.println("Este livro não está na lista de livros emprestados.");
        }

    }

    public void exibirLivrosEmprestados() {

        System.out.println("Livros emprestados por " + nomeUsuario + ":");

        if (livrosEmprestados.isEmpty()) {
            System.out.println("Nenhum livro emprestado.");
        } 

        else {

            for (Livro livro : livrosEmprestados) {
                livro.exibirInfos();
            }

        }

    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

}
