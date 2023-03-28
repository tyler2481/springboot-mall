package com.tyler.springbootmail.service;

import com.tyler.springbootmail.model.Product;

public interface ProductService {
    Product getProductById(Integer productId);
}
