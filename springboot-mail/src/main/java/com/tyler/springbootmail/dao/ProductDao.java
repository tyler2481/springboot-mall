package com.tyler.springbootmail.dao;

import com.tyler.springbootmail.model.Product;

public interface ProductDao {
    Product getProductById(Integer productId);
}
