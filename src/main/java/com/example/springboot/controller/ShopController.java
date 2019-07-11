package com.example.springboot.controller;


import com.example.springboot.entity.Area;
import com.example.springboot.entity.ShopCategory;
import com.example.springboot.repository.AreaRepository;
import com.example.springboot.repository.ShopCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ShopController {
    @Autowired
    AreaRepository areaRepository;
    @Autowired
    ShopCategoryRepository shopCategoryRepository;

    @RequestMapping(value = "/o2o/shopadmin/getshopinitinfo",method = RequestMethod.GET)
    public Map<String, Object> getShopInit() {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<ShopCategory> shopCategoryList = new ArrayList<ShopCategory>();
        List<Area> areaList = new ArrayList<Area>();
        try {
            areaList = areaRepository.findAll();
            shopCategoryList = shopCategoryRepository.findAll();
            modelMap.put("shopCategoryList", shopCategoryList);
            modelMap.put("areaList", areaList);
            modelMap.put("success", true);
        } catch (Exception e) {
            modelMap.put("success", false);
            modelMap.put("errMsg", e.getMessage());
        }
        return modelMap;
    }
//    @RequestMapping(value = "/o2o/shopadmin/registershop",method = RequestMethod.POST)
//    public Map<String, Object> addShop(HttpServletRequest request) {
//        Map<String,Object> modelMap = new HashMap<>();
//        String s
//
//    }



}




