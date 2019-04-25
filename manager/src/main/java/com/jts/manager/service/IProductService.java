package com.jts.manager.service;

import com.jts.entity.Product;

/**
 * @author jia ting shuai
 * @date 2019/4/25 10:58
 */
public interface IProductService {
    /**
     * 添加产品
     * @param product 要添加的实体类
     * @return 添加后的结果
     */
    Product addProduct(Product product);

    Product findOne(String id);
}
