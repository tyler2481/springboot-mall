package com.tyler.springbootmail.service.impl;

import com.tyler.springbootmail.dao.ProductDao;
import com.tyler.springbootmail.model.Product;
import com.tyler.springbootmail.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
