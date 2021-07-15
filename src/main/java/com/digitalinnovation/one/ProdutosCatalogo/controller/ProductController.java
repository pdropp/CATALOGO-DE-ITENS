package com.digitalinnovation.one.ProdutosCatalogo.controller;


import com.digitalinnovation.one.ProdutosCatalogo.modal.Produtos;
import com.digitalinnovation.one.ProdutosCatalogo.repository.RepositoryProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/product")
public class ProductController{

    @Autowired
    private RepositoryProduct repositoryProduct;

    @RequestMapping(method = RequestMethod.POST)
    Produtos create(@RequestBody Produtos produtos){
        return repositoryProduct.save(produtos);
    }


}
