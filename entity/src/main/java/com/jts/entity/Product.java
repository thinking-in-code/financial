package com.jts.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jia ting shuai
 * @date 2019/4/22 19:11
 */
@Data
@Entity
public class Product implements Serializable {

    private static final long serialVersionUID = -4521865397937710619L;
    @Id
    private String id;

    private String name;
    /**
     * @see com.jts.entity.enums.ProductStatus
     */
    private String status;

    /**
     * 起投金额
     */
    private BigDecimal threshouldAmount;

    /**
     * 投资步长
     */
    private BigDecimal stepAmount;

    /**
     * 锁定期
     */
    private Integer lockTerm;

    /**
     * 收益率
     */
    private BigDecimal rewardRate;

    /**
     * 备注
     */
    private String memo;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 更新时间
     */
    private Date updateAt;

    /**
     * 创建者
     */
    private String createUser;

    /**
     * 更新者
     */
    private String updateUser;
}
