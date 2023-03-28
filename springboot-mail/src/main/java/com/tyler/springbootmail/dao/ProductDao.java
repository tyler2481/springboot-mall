package com.tyler.springbootmail.dao;

import com.tyler.springbootmail.dto.ProductRequest;
import com.tyler.springbootmail.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}