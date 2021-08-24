package com.andrew.demo.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Andrew Yang
 * @ClassName ProductServiceBiz
 * @Description
 * @Package com.andrew.demo.service
 * @Create 2021-08-24 16:46
 */
public interface ProductServiceBiz {
    @Transactional(rollbackFor = ArithmeticException.class)
    void sellProductBiz();
}
