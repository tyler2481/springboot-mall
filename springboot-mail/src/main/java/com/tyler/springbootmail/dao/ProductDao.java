package com.tyler.springbootmail.dao;

import com.tyler.springbootmail.dto.ProductQueryParams;
import com.tyler.springbootmail.dto.ProductRequest;
import com.tyler.springbootmail.model.Product;

import java.util.List;

public interface ProductDao {

    Integer countProduct(ProductQueryParams productQueryParams);

    List<Product> getProducts(ProductQueryParams productQueryParams);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
