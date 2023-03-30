package com.tyler.springbootmail.service;

import com.tyler.springbootmail.dto.ProductRequest;
import com.tyler.springbootmail.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts();
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
