package com.cfcp.incc.dao;


import com.cfcp.incc.entity.OrderPriceSystem;
import com.cfcp.incc.entity.OrderPriceSystem1;

import java.util.List;
import java.util.Map;

// 价格体系 20190415
public interface OrderPriceSystemDao {
    List<OrderPriceSystem> queryAll();
    /*List<OrderPriceSystem> queryAll1_1(Map conditions);*/
    List<OrderPriceSystem> queryAll1();
    List<OrderPriceSystem> queryAll01();
    OrderPriceSystem findOrderPriceSystemById(String id);
    OrderPriceSystem queryByScjrf();
    int insert(OrderPriceSystem op);
    int update(OrderPriceSystem op);
}
