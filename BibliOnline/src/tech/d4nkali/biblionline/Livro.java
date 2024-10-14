package tech.d4nkali.biblionline;

class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {

        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    public void exibirInfos() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao);
    }

    // Gets e Sets

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

}
