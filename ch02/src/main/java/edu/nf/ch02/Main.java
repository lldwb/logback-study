package edu.nf.ch02;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Slf4j注解会创建一个log日志对象
 */
@Slf4j
public class Main {

    public static void main(String[] args) {
        log.trace("简单的日志输出");
        log.debug("调试日志信息");
        log.info("业务日志信息");
        log.warn("警告日志信息");
        log.error("异常日志信息");
    }
}