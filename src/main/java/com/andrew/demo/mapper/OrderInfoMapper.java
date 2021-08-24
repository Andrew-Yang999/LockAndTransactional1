package com.andrew.demo.mapper;

import com.andrew.demo.entity.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author Andrew Yang
 * @ClassName OrderInfoMapper
 * @Description
 * @Package com.andrew.demo.mapper
 * @Create 2021-08-24 11:24
 */
@Mapper
public interface OrderInfoMapper {

    Integer insertSelective(OrderInfo orderInfo);
}
