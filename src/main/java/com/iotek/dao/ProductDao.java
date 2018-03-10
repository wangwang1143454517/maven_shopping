package com.iotek.dao;

import com.iotek.po.Product;

import java.util.List;


public interface ProductDao {

    Product  queryProductById(int pid);
     List<Product> queryallProduct();
}
