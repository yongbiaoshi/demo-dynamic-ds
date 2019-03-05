package com.my.demo.dds.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = {"com.my.demo.dds.dao.mapper"})
public class MybatisConfig {



}
