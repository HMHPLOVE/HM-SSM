package com.hp.exception;

/**
 * 重复秒杀异常(运行期异常)
 * Created by zhangyijun on 15/10/16.
 */
public class RepeatKillException extends RuntimeException {

    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
