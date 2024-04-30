package com.app.apiteste.mapper;

import com.app.apiteste.dto.response.ProdutoResponseDTO;
import com.app.apiteste.entity.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);


//    @Mapping(source = "nome", target = "nome")
//    @Mapping(source = "preco", target = "preco")
    ProdutoResponseDTO produtoToProdutoResponseDTO(Produto produto);
}
