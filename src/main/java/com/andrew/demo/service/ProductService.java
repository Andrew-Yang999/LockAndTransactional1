package com.andrew.demo.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Author Andrew Yang
 * @ClassName ProductService
 * @Description
 * @Package com.andrew.demo.service
 * @Create 2021-08-24 10:00
 */
public interface ProductService {
    @Transactional
    void sellProduct();
}
