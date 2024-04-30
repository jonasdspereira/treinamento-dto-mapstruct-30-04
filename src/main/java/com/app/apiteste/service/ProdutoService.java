package com.app.apiteste.service;


import com.app.apiteste.dto.response.ProdutoResponseDTO;
import com.app.apiteste.entity.Produto;
import com.app.apiteste.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.apiteste.mapper.ProdutoMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoResponseDTO> listarProdutos() {
        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream()
                .map(ProdutoMapper.INSTANCE::produtoToProdutoResponseDTO)
                .collect(Collectors.toList());
    }

}
