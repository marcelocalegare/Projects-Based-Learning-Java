# 📌 Exercício -- Sistema de Controle de Produto

## 🎯 Objetivo

Praticar os seguintes conceitos de Java:

-   Programação Orientada a Objetos (POO)
-   Encapsulamento
-   Atributos privados
-   Construtores
-   Uso da palavra-chave `this`
-   Getters e Setters
-   Validações internas

------------------------------------------------------------------------

## 📝 Enunciado

Crie uma classe chamada `Produto` para representar um item de um
estoque.

### 🔹 Atributos (todos privados):

-   `nome` (String)\
-   `preco` (double)\
-   `quantidade` (int)

------------------------------------------------------------------------

## 📌 Requisitos

1.  Criar um construtor que receba:

    -   nome\
    -   preço\
    -   quantidade inicial

2.  Utilizar `this` dentro do construtor.

3.  Criar getters e setters para todos os atributos.

4.  Implementar as seguintes regras:

    -   O preço não pode ser menor ou igual a zero.
    -   A quantidade não pode ser negativa.
    -   Caso valores inválidos sejam informados, exibir mensagem e não
        alterar o atributo.

------------------------------------------------------------------------

## 🔧 Métodos obrigatórios

-   `adicionarEstoque(int quantidade)`
    -   Só deve permitir valores positivos.
-   `removerEstoque(int quantidade)`
    -   Só deve permitir remover se houver estoque suficiente.
-   `valorTotalEmEstoque()`
    -   Retorna o valor total (preço × quantidade).
-   `exibirInformacoes()`
    -   Mostra todos os dados do produto.

------------------------------------------------------------------------

## 🖥 Classe Main

No método `main`:

1.  Criar um objeto `Produto`.
2.  Adicionar itens ao estoque.
3.  Remover alguns itens.
4.  Exibir:
    -   Dados do produto\
    -   Valor total em estoque

------------------------------------------------------------------------

## ⭐ Desafio Extra

-   Impedir que o nome seja vazio.
-   Formatar o valor monetário com duas casas decimais.
-   Criar um segundo construtor que receba apenas nome e preço
    (quantidade inicia em 0).

------------------------------------------------------------------------

## 📚 Entrega

Implemente o exercício seguindo as regras acima. Após finalizar, revise
se:

-   Todos os atributos estão privados.
-   As validações estão funcionando corretamente.
-   Nenhum atributo é alterado diretamente fora da classe.
