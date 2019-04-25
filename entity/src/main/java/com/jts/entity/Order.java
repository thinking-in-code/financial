package com.jts.entity;

import lombok.Data;
import lombok.Value;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author jia ting shuai
 * @date 2019/4/22 19:11
 */
@Data
@Entity(name = "order_t")
public class Order implements Serializable {
    @Id
    private String id;

    /**
     * 渠道id,套壳公司id
     */
    private String chanId;

    private String chanUserId;

    /**
     * @see com.jts.entity.enums.OrderType
     */
    private String orderType;

    private String productId;

    private BigDecimal amount;

    private String outerOrderId;

    /**
     * @see com.jts.entity.enums.OrderStatus
     */
    private String orderStatus;

    private String memo;

    private Date createAt;

    private Date updateAt;

}
