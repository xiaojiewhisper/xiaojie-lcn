package com.xiaojie.api.order;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description:订单服务接口
 * @author: xiaojie
 * @date: 2021.07.19
 */
public interface OrderService {
    @PostMapping("/finishOrder")
    void finishOrder( String orderId);
}
