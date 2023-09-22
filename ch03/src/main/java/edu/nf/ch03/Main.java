package edu.nf.ch03;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.debug("调试日志");
        log.info("常规日志");
        log.warn("警告日志");
        log.error("异常日志");
    }
}