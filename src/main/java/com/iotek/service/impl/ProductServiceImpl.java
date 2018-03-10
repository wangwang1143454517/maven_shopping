package com.iotek.service.impl;

import com.iotek.dao.ProductDao;
import com.iotek.po.Product;
import com.iotek.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public Product queryProductById(int pid) {
        return null;
    }

    @Override
    public List<Product> queryAllProduct() {
        return productDao.queryallProduct();
    }
}
