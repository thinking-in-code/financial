package com.jts.manager.service.impl;

import com.jts.entity.Product;
import com.jts.entity.enums.ProductStatus;
import com.jts.manager.repositories.ProductRepository;
import com.jts.manager.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author jia ting shuai
 * @date 2019/4/25 10:59
 */
@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Product addProduct(Product product) {
        log.debug("创建产品，参数：{}", product);
        //数据校验
        checkProduct(product);

        //设置默认值
        setDefault(product);

        Product result = productRepository.save(product);
        log.debug("创建产品,结果:{}", result);
        return result;
    }

    private void setDefault(Product product) {
        if (product.getCreateAt() == null) {
            product.setCreateAt(new Date());
        }
        if (product.getUpdateAt() == null) {
            product.setUpdateAt(new Date());
        }
        if (product.getStepAmount() == null) {
            product.setStepAmount(BigDecimal.ZERO);
        }
        if (product.getLockTerm() == null) {
            product.setLockTerm(0);
        }
        if (product.getStatus() == null) {
            product.setStatus(ProductStatus.AUDITING.name());
        }
    }

    /**
     * 产品参数校验
     * 1.非空
     * 2.收益率要0-30以内
     * 3.投资步长需为整数
     *
     * @param product 要校验的产品
     */
    private void checkProduct(Product product) {
        Assert.notNull(product.getId(), "产品编号不可为空");
        //其他非空校验

        Assert.isTrue((BigDecimal.ZERO.compareTo(product.getRewardRate()) < 0 && BigDecimal.valueOf(30).compareTo(product.getRewardRate()) >= 0), "收益率必须在0到30以内");

        Assert.isTrue(BigDecimal.valueOf(product.getStepAmount().longValue()).compareTo(product.getStepAmount()) == 0, "投资步长需为整数");
    }

    /**
     * 根据产品id获取产品实体
     *
     * @param id 产品id
     * @return 返回的产品结果
     */
    @Override
    public Product findOne(String id) {
        Assert.notNull(id, "要查询的产品编号不能为空");
        log.debug("查询单个产品,id={}", id);

        Product product = productRepository.findById(id).get();
        return product;
    }

}
