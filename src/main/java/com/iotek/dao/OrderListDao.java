package com.iotek.dao;

import com.iotek.po.OrderList;

import java.util.List;


public interface OrderListDao {
   List<OrderList> findOrderListByCid(int cid);
}

