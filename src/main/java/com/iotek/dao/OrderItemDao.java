package com.iotek.dao;

import com.iotek.po.OrderItem;
import com.iotek.po.OrderList;

import java.util.List;


public interface OrderItemDao {
    List<OrderItem>  findOrderItemByOrderList(OrderList orderList);
}
