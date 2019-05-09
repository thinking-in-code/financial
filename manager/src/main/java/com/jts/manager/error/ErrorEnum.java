package com.jts.manager.error;

import lombok.Data;

/**
 * @author jia ting shuai
 * @date 2019/5/9 13:08
 */
public enum ErrorEnum {
    /**
     * 编号不可为空
     */
    ID_NOT_NULL("FOO1","编号不可为空",false),
    UNKNOWN("999","未知异常",false);
    /**
     * 错误码
     */
    private String code;
    /**
     * 信息说明
     */
    private String message;
    /**
         * 是否可重试
     */
    private boolean canRetry;

    ErrorEnum(String code, String message, boolean canRetry) {
        this.code = code;
        this.message = message;
        this.canRetry = canRetry;
    }

    public static ErrorEnum getByCode(String code){
        for (ErrorEnum errorEnum : ErrorEnum.values()) {
            if(errorEnum.code.equals(code)){
                return errorEnum;
            }
        }
        return UNKNOWN;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCanRetry() {
        return canRetry;
    }

    public void setCanRetry(boolean canRetry) {
        this.canRetry = canRetry;
    }
}
