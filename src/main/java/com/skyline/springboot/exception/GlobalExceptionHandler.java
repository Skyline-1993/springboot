package com.skyline.springboot.exception;

import com.skyline.springboot.util.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理
 *
 * @author zhangkepeng
 */
// @RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 未知异常
     *
     * @return 返回异常处理对象
     */
    @ExceptionHandler(Exception.class)
    public R exceptionHandler(Exception e) {
        logger.error(e.getMessage());
        return R.error("500000", "服务器异常");
    }

    /**
     * 空指针异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public R exceptionHandler(NullPointerException e) {
        logger.error(e.getMessage());
        return R.error("500001", "参数为空");
    }

    /**
     * 数组越界异常处理
     *
     * @param e
     * @return
     */
    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public R exceptionHandler(ArrayIndexOutOfBoundsException e) {
        logger.error(e.getMessage());
        return R.error("500002", "数组越界");
    }


}
