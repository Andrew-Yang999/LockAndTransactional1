package com.andrew.demo.service.impl;

import com.andrew.demo.service.ProductService;
import com.andrew.demo.service.ProductServiceBiz;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Andrew Yang
 * @ClassName ProductServiceImpl
 * @Description
 * @Package com.andrew.demo.service.impl
 * @Create 2021-08-24 10:00
 */
@Service("ProductService")
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductServiceBiz productServiceBiz;

    private final Lock lock = new ReentrantLock(true);

    //    @Transactional(noRollbackFor = ArithmeticException.class,rollbackFor = ArithmeticException.class)
    @Override
    public synchronized void sellProduct() {
        try {
//            lock.lock();
            productServiceBiz.sellProductBiz();
        } finally {
            System.out.println(Thread.currentThread().getName() + ":hashCode=" + this.hashCode() + ",释放锁");
//            lock.unlock();
        }
    }


}
