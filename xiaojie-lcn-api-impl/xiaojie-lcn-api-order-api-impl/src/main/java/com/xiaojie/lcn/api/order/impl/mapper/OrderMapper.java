package com.xiaojie.lcn.api.order.impl.mapper;

import org.apache.ibatis.annotations.Update;

/**
 * @Description:
 * @author: xiaojie
 * @date: 2021.07.19
 */
public interface OrderMapper {

    @Update("update tb_order set orderState=1 where orderId=#{orderId}")
    Integer finishOrder(String orderId);
}
