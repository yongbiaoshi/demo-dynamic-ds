package com.my.demo.dds.service.impl;

import com.my.demo.dds.entity.po.Country;
import com.my.demo.dds.dao.mapper.CountryMapper;
import com.my.demo.dds.service.CountryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shiyongbiao
 * @since 2019-03-05
 */
@Service
public class CountryServiceImpl extends ServiceImpl<CountryMapper, Country> implements CountryService {

}
