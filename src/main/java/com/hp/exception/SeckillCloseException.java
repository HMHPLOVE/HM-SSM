package com.hp.exception;

/**
 * 秒杀关闭异常
 * Created by zhangyijun on 15/10/16.
 */
public class  SeckillCloseException extends RuntimeException {

    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
