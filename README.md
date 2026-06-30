# Sistema de Gestão de Biblioteca

Este projeto é um Sistema Web desenvolvido como requisito de avaliação (MAPA) para o curso de Análise e Desenvolvimento de Sistemas da UniCesumar. O objetivo principal é aplicar conceitos práticos de Programação Orientada a Objetos (POO) e a arquitetura MVC (Model-View-Controller) no ecossistema Java.

## Objetivo do Projeto

Desenvolver uma aplicação para o gerenciamento de livros de uma biblioteca universitária, permitindo o cadastro, listagem e exclusão de obras diretamente através de uma interface web, manipulando o estado da aplicação em memória.

## Funcionalidades (Requisitos Atendidos)

- **Cadastro de Livros:** Inserção de novos livros contendo Título, Autor, Ano de Publicação e ISBN.
- **Listagem de Acervo:** Exibição clara e organizada de todos os livros cadastrados no sistema.
- **Exclusão de Registros:** Remoção de livros específicos da lista baseada na sua identificação.
- **Validação de Regras de Negócio:** Tratamento de erros, impedindo submissões com campos vazios, anos inválidos ou ISBNs com menos de 10 caracteres (com feedback visual na interface).

## Tecnologias Utilizadas

- **Linguagem:** Java
- **Framework:** Spring Boot (Spring Web)
- **Motor de Templates (View):** Thymeleaf
- **Build Tool:** Maven
- **Arquitetura:** MVC (Model, View, Controller)
- **Armazenamento:** Estrutura de dados em memória (List)

## Como Executar o Projeto

1. Clone este repositório para a sua máquina local:
   ```bash
   git clone [https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git](https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git)
