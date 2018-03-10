package com.iotek.dao;

import com.iotek.po.ProductDetail;


public interface ProductDetailDao {
    ProductDetail findProductDetailById(int id);
    ProductDetail findProductDetailByPId(int pId);
}
