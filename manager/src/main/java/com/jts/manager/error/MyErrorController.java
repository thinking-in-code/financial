package com.jts.manager.error;

import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * MyErrorController继承了BasicErrorController，所以它的注解也会被继承
 * @author jia ting shuai
 * @date 2019/5/8 13:17
 */
public class MyErrorController extends BasicErrorController {

    public MyErrorController(ErrorAttributes errorAttributes, ErrorProperties errorProperties, List<ErrorViewResolver> errorViewResolvers) {
        super(errorAttributes, errorProperties, errorViewResolvers);
    }

    /**
     * 看源码，我们可以看到返回给前端的json信息是调用的getErrorAttributes()方法，
     * 而getErrorAttributes()方法又是BasicErrorController继承自它的父类AbstractErrorController的，
     * 所以我们只要重写这个方法即可。
     * 原来返回的json格式是：
     * {
     *     "timestamp": "2019-05-09 12:44:29",
     *     "status": 500,
     *     "error": "Internal Server Error",
     *     "exception": "java.lang.IllegalArgumentException",
     *     "message": "产品编号不可为空",
     *     "path": "/manager/product/add"
     * }
     */
    @Override
    protected Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        Map<String, Object> attributes = super.getErrorAttributes(request, includeStackTrace);
        attributes.remove("timestamp");
        attributes.remove("error");
        attributes.remove("exception");
        attributes.remove("path");
        attributes.remove("status");
        String code  = (String)attributes.get("message");
        ErrorEnum errorEnum = ErrorEnum.getByCode(code);
        attributes.put("code",code);
        attributes.put("message",errorEnum.getMessage());
        attributes.put("canRetry",errorEnum.isCanRetry());
        return attributes;
    }
}
