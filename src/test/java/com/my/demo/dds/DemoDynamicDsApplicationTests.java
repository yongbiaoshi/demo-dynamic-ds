package com.my.demo.dds;

import com.my.demo.dds.entity.po.City;
import com.my.demo.dds.service.CityService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoDynamicDsApplicationTests {

    @Resource
    private CityService cityService;

    @Test
    public void contextLoads() {
        City city = cityService.getById(1);
        System.out.println(city);
    }

}
