package com.jts.manager.controller;

import com.jts.entity.Product;
import com.jts.manager.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jia ting shuai
 * @date 2019/5/6 18:33
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    IProductService productService;

    @PostMapping("add")
    public Product addProduct(Product product){
        Product addedProduct = productService.addProduct(product);
        return addedProduct;
    }
}
