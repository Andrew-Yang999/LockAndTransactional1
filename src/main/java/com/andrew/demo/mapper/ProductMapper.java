package com.andrew.demo.mapper;

import com.andrew.demo.entity.Product;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Andrew Yang
 * @ClassName ProductMapper
 * @Description
 * @Package com.andrew.demo.mapper
 * @Create 2021-08-24 10:05
 */
@Mapper
public interface ProductMapper {

    Product selectByPrimaryKey(int i);

    Integer updateByPrimaryKey(Product updateProduct);

}
