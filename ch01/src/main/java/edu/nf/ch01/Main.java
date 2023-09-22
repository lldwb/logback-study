package edu.nf.ch01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    /**
     * 声明slf4j的日志对象
     */
    private final static Logger log = LoggerFactory.getLogger(Main.class);


    public void add() {
        log.debug("这是调试日志信息");
        log.info("这是业务日志信息");
        log.warn("这是警告日志信息");
        log.error("这是异常错误日志信息");
    }

    public static void main(String[] args) {
        new Main().add();
    }
}