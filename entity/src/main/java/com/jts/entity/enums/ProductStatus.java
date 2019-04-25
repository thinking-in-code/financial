package com.jts.entity.enums;

/**
 * @author jia ting shuai
 * @date 2019/4/22 19:55
 */
public enum ProductStatus {
    AUDITING("审核中"),

    IN_SELL("销售中"),

    LOCKED("锁定,暂停销售"),

    FINISHED("已结束");

    private String desc;

    ProductStatus(String desc){
        this.desc = desc;
    }
}
