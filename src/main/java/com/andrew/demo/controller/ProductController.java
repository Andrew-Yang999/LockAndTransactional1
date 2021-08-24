package com.andrew.demo.controller;

import com.andrew.demo.entity.Product;
import com.andrew.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CountDownLatch;

/**
 * @Author Andrew Yang
 * @ClassName ProductController
 * @Description
 * @Package com.andrew.demo.controller
 * @Create 2021-08-24 10:40
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/sell")
    public void sellProduct() {
        CountDownLatch countDownLatch = new CountDownLatch(100);
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    countDownLatch.await();
                    productService.sellProduct();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
            countDownLatch.countDown();
        }
//        productService.sellProduct();
    }
}
