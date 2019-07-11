package com.example.springboot.common;

import com.example.springboot.entity.Area;
import com.example.springboot.repository.AreaRepository;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaTest {
    @Autowired
    AreaRepository areaRepository;

    @Test
    @Ignore
    public void areaAddTest() {
        Area area = new Area();
        area.setAreaName("东苑");
        area.setCreatTime(new Date());
        area.setLastEditTime(new Date());
        area.setPriority(10);
        areaRepository.save(area);
        System.out.println("添加成功");
    }
    @Test
    public void areaFindTest(){
        List<Area> list = areaRepository.findAll();
        System.out.println(list.size());
    }
}
