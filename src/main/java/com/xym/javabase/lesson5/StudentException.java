package com.xym.javabase.lesson5;

/**
 * 自定义异常
 *
 * @author xym
 * @create 2019-07-14 15:31
 */
public class StudentException extends Exception {
    public StudentException(String message) {
        super(message);
    }

    public StudentException(String message, Throwable cause) {
        super(message, cause);
    }
}
