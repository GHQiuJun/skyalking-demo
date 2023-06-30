package com.demo.skyalking.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.skywalking.apm.toolkit.trace.Trace;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

/**
 * @program: TestService
 * @description: 通用功能测试 Service
 * @author: Lorin
 * @create: 2023-06-29 21:22
 **/
@Service
@Slf4j
public class TestService {

    @Trace
    public void testDelay() throws InterruptedException {
        log.info("this is testDelay");
        Thread.sleep(3000);
        testNext();
    }

    @Trace
    public void testNextDelay() throws InterruptedException {
        log.info("this is testNextDelay");
        Thread.sleep(3000);
    }

    @Trace
    public void test() throws InterruptedException {
        log.info("this is test");
        testNext();
    }

    @Trace
    public void testNext() throws InterruptedException {
        log.info("this is testNext");
    }
}
