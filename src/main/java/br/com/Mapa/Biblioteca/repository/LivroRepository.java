package br.com.Mapa.Biblioteca.repository;

import br.com.Mapa.Biblioteca.model.Livro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepository {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> listarTodos() {
        return livros;
    }

    public void salvar(Livro livro) {
        livros.add(livro);
    }

    public void excluirPorId(String id) {
        livros.removeIf(livro -> livro.getId().equals(id));
    }
}