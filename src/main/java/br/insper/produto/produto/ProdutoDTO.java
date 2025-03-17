package br.insper.produto.produto;

public record CadastraProdutoDTO(String nome, Float preco, Integer estoque) {
}

public record RetornarProdutoDTO(String id, String nome, Float preco, Integer estoque) {
}

record EditarProdutoDTO(String nome, Float preco, Integer estoque) {
}
