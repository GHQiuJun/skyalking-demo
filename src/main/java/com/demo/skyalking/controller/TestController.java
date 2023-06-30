package com.demo.skyalking.controller;

import com.demo.skyalking.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: TestController
 * @description: 通用功能测试
 * @author: Lorin
 * @create: 2023-06-29 21:20
 **/
@RestController
@RequestMapping("/common")
@Slf4j
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/test-delay")
    public void testDelay() throws InterruptedException {
        System.out.println("this is a test");
        testService.testDelay();
    }

    @GetMapping("/test")
    public void test() throws InterruptedException {
        System.out.println("this is a test");
        testService.test();
    }
}
