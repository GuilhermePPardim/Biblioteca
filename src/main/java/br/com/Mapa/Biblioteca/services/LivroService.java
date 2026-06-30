package br.com.Mapa.Biblioteca.services;

import br.com.Mapa.Biblioteca.model.Livro;
import br.com.Mapa.Biblioteca.repository.LivroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository repository;

    public LivroService(LivroRepository repository) {
        this.repository = repository;
    }

    public List<Livro> listarTodos() {
        return repository.listarTodos();
    }

    public String salvar(Livro livro) {
        // Validações básicas
        if (livro.getTitulo() == null || livro.getTitulo().isBlank()) return "O Título é obrigatório.";
        if (livro.getAutor() == null || livro.getAutor().isBlank()) return "O Autor é obrigatório.";
        if (livro.getAno() == null || livro.getAno() <= 0) return "Ano inválido.";
        if (livro.getIsbn() == null || livro.getIsbn().length() < 10) return "O ISBN deve ter no mínimo 10 caracteres.";

        repository.salvar(livro);
        return null; // Retorna null se não houver erros
    }

    public void excluir(String id) {
        repository.excluirPorId(id);
    }
}