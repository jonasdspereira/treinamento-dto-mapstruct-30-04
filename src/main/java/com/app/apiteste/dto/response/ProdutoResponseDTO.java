package com.app.apiteste.dto.response;

import lombok.Data;

@Data
public class ProdutoResponseDTO {
    private Long id;
    private String nome;
    private double preco;
    private String marca;
}
