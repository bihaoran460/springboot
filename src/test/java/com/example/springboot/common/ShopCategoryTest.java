package com.example.springboot.common;

import com.example.springboot.entity.ShopCategory;
import com.example.springboot.repository.ShopCategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShopCategoryTest {
    @Autowired
    ShopCategoryRepository shopCategoryRepository;

    @Test
    public void shopCategoryAddTest()
    {
        ShopCategory shopCategory = new ShopCategory();
        shopCategory.setCreateTime(new Date());
        shopCategory.setLastEditTime(new Date());
        shopCategory.setPriority(2);
        shopCategory.setShopCategoryDesc("测试");
        shopCategory.setShopCategoryImg("没有");
        shopCategory.setShopCategoryName("美食");
        shopCategoryRepository.save(shopCategory);
    }
}
