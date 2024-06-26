package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;

public interface ShoppingCartService {

    /**
     * 添加购物车
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 根据用户id查询购物车列表
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    void clean();
}
