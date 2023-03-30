package com.tyler.springbootmail.dao;

import com.tyler.springbootmail.constant.ProductCategory;
import com.tyler.springbootmail.dto.ProductRequest;
import com.tyler.springbootmail.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductCategory category, String search);
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void  updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
