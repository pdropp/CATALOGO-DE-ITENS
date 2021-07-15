package com.digitalinnovation.one.ProdutosCatalogo.controller;


import com.digitalinnovation.one.ProdutosCatalogo.modal.Produtos;
import com.digitalinnovation.one.ProdutosCatalogo.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
public class ProductController{


    //Metodo post de adicionar um produto
    @Autowired
    private RepositoryProduct repositoryProduct;

    @RequestMapping(method = RequestMethod.POST)
    Produtos create(@RequestBody Produtos produtos){
        return repositoryProduct.save(produtos);
    }
    //Metodo de busca
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    Optional<Produtos> findById(@PathVariable Integer id){
        return repositoryProduct.findById(id);
    }

}
