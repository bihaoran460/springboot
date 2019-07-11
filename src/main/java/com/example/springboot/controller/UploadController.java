package com.example.springboot.controller;

import com.example.springboot.utils.FileUtil;
import com.example.springboot.utils.PathUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {

    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)
    public String uploadImg(@RequestParam("file") MultipartFile file, HttpServletRequest request){
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        System.out.println("测试上传");
        String filePath = PathUtil.getImgBasePath();
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return "uploadimg success";
    }

    @RequestMapping(value = "/testuploadimgs",method = RequestMethod.POST)
    public Map<String,Object> uploadImgs(@RequestParam("file") MultipartFile[] files, HttpServletRequest request){
        Map<String,Object> modelMap = new HashMap<>();
        int lenth=files.length;
        System.out.println("数组的长度" + lenth);
        for(int i=0;i<lenth;i++) {
            String contentType = files[i].getContentType();
            String fileName = files[i].getOriginalFilename();
            String filePath = PathUtil.getImgBasePath();
            try {
                FileUtil.uploadFile(files[i].getBytes(), filePath, fileName);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        modelMap.put("code",200);
        return modelMap;


        }


}
