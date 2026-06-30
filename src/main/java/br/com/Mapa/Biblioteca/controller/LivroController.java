package br.com.Mapa.Biblioteca.controller;

import br.com.Mapa.Biblioteca.model.Livro;
import br.com.Mapa.Biblioteca.services.LivroService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    // Mostra a página principal com a lista e o formulário
    @GetMapping
    public String index(Model model) {
        model.addAttribute("livros", service.listarTodos());
        model.addAttribute("novoLivro", new Livro());
        return "index";
    }

    // Processa o formulário de cadastro
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute("novoLivro") Livro livro, RedirectAttributes redirectAttributes) {
        String erro = service.salvar(livro);

        if (erro != null) {
            redirectAttributes.addFlashAttribute("erro", erro);
        } else {
            redirectAttributes.addFlashAttribute("sucesso", "Livro cadastrado com sucesso!");
        }

        return "redirect:/";
    }

    // Processa a exclusão
    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable String id, RedirectAttributes redirectAttributes) {
        service.excluir(id);
        redirectAttributes.addFlashAttribute("sucesso", "Livro excluído com sucesso!");
        return "redirect:/";
    }
}