package com.example.springboot.common;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileTest {

    @Test
    public void fileTest()
    {
        File file=new File("/Users/bihaoran460/test");
        if(!file.exists()){
            file.mkdirs();
        }

    }
}
