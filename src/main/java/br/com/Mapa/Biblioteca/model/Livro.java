package br.com.Mapa.Biblioteca.model;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private int Ano;
    private String Isbn;

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

    public int getAno() {
        return Ano;
    }

    public void setAno(int ano) {
        Ano = ano;
    }

    public String getIsbn() {
        return Isbn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }
}