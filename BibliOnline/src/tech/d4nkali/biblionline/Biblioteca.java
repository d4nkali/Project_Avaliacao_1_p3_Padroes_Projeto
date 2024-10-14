package tech.d4nkali.biblionline;

import java.util.ArrayList;
import java.util.List;

class Biblioteca {

    private String nomeBiblioteca;
    private List<Livro> livrosDisponiveis;

    public Biblioteca(String nomeBiblioteca) {

        this.nomeBiblioteca = nomeBiblioteca;
        this.livrosDisponiveis = new ArrayList<>();

    }

    public void adicionarLivro(Livro livro) {

        livrosDisponiveis.add(livro);
        System.out.println("Livro adicionado: " + livro.getTitulo());

    }

    public boolean removerLivro(Livro livro) {

        if (livrosDisponiveis.remove(livro)) {

            return true;

        }

        else {

            return false;

        }

    }

    public void exibirLivrosDisponiveis() {

        System.out.println("Livros disponíveis na " + nomeBiblioteca + ":");

        if (livrosDisponiveis.isEmpty()) {

            System.out.println("Nenhum livro disponível.");

        } 

        else {

            for (Livro livro : livrosDisponiveis) {
                livro.exibirInfos();
            }

        }

    }

    public String getNomeBiblioteca() {
        return nomeBiblioteca;
    }

    public void setNomeBiblioteca(String nomeBiblioteca) {
        this.nomeBiblioteca = nomeBiblioteca;
    }

}