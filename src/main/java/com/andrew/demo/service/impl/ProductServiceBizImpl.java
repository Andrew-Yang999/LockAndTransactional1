package com.andrew.demo.service.impl;

import com.andrew.demo.entity.OrderInfo;
import com.andrew.demo.entity.Product;
import com.andrew.demo.mapper.OrderInfoMapper;
import com.andrew.demo.mapper.ProductMapper;
import com.andrew.demo.service.ProductServiceBiz;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author Andrew Yang
 * @ClassName ProductServiceBizImpl
 * @Description
 * @Package com.andrew.demo.service.impl
 * @Create 2021-08-24 16:46
 */
@Service("ProductServiceBiz")
public class ProductServiceBizImpl implements ProductServiceBiz {
    @Resource
    private ProductMapper productMapper;
    @Resource
    private OrderInfoMapper orderInfoMapper;

    @Transactional(rollbackFor = ArithmeticException.class)
    @Override
    public void sellProductBiz() {
        System.out.println(Thread.currentThread().getName());
//            int a = 1 / 0;
        Product product = productMapper.selectByPrimaryKey(1);
        Integer productCount = product.getProductCount();
        System.out.println(Thread.currentThread().getName() + ":hashCode=" + this.hashCode() + ",当前库存=" + productCount);
        if (0 < productCount) {
            Product updateProduct = new Product();
            updateProduct.setId(product.getId());
            updateProduct.setProductCount(productCount - 1);
            productMapper.updateByPrimaryKey(updateProduct);
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setBuyGoods(product.getProductName());
            orderInfo.setBuyName(Thread.currentThread().getName());
            orderInfoMapper.insertSelective(orderInfo);
            System.out.println(Thread.currentThread().getName() + ":hashCode=" + this.hashCode() + ",减库存完毕，创建订单");
        } else {
            System.out.println(Thread.currentThread().getName() + ":hashCode=" + this.hashCode() + ",没有库存了");
        }
    }
}
