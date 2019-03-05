package com.my.demo.dds.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.my.demo.dds.entity.po.City;
import com.my.demo.dds.dao.mapper.CityMapper;
import com.my.demo.dds.service.CityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shiyongbiao
 * @since 2019-03-05
 */
@Service
public class CityServiceImpl extends ServiceImpl<CityMapper, City> implements CityService {

    @DS("slave")
    @Override
    public City getById(Serializable id) {
        return super.getById(id);
    }
}
