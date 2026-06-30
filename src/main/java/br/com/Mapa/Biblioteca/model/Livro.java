package br.com.Mapa.Biblioteca.model;

import java.util.UUID;

public class Livro {
    private String id;
    private String titulo;
    private String autor;
    private Integer ano;
    private String isbn;

    public Livro() {
        // Gera um ID único sempre que um livro for criado
        this.id = UUID.randomUUID().toString();
    }

    // Getters e Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
}