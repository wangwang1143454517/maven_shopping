package com.iotek.service;

import com.iotek.po.Product;

import java.util.List;


public interface ProductService {
    Product queryProductById(int pid);

    List<Product> queryAllProduct();
}
