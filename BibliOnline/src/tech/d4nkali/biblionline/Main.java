package tech.d4nkali.biblionline;

public class Main {

    public static void main(String[] args) {

        //? Criando objetos dos livros
        Livro livro1 = new Livro("1984", "George Orwell", 1949);
        Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);

        //? Criando usuário
        Usuario usuario1 = new Usuario("Ana");

        //? Criando biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");

        //? Função que adiciona os livros que foram criados na biblioteca
        System.out.println("Adicionando livros...");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println();

        //* Função que exibe livros disponíveis
        System.out.println("Exibir livros na biblioteca");
        biblioteca.exibirLivrosDisponiveis();

        System.out.println();

        //* Função onde o usuário empresta um livro
        System.out.println("Empréstimo de Livro");
        usuario1.emprestarLivro(biblioteca, livro1);

        System.out.println();

        //* Função que exibe os livros emprestados pelo usuário
        System.out.println("Exibir livros emprestados pelo usuário");
        usuario1.exibirLivrosEmprestados();

        System.out.println();

        //* Função que lista os livros disponíveis na biblioteca após o empréstimo
        System.out.println("Exibir livros disponíveis na biblioteca apos empréstimo");
        biblioteca.exibirLivrosDisponiveis();

        System.out.println();

        //* Função que usuário devolve o livro
        System.out.println("Usuário devolver livro");
        usuario1.devolverLivro(biblioteca, livro1);

        System.out.println();

        //* Função que exibe os livros disponíveis após a devolução
        System.out.println("Exibir livros disponíveis na biblioteca apos devolução");
        biblioteca.exibirLivrosDisponiveis();

    }

}
