package com.sha.springbootmicroservice1.service;

import com.sha.springbootmicroservice1.model.Product;

import java.util.List;

public interface IProductService {


    Product saveProduct(Product product);

    void deleteProduct(Long productId);

    List<Product> findAllProducts();

}