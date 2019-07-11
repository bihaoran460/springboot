package com.example.springboot.utils;

public class PathUtil {
	private static String seperator=System.getProperty("file.separator");
	public static String getImgBasePath() {
		
		String os=System.getProperty("os.name");//获取操作系统
		String basePath="";
		if(os.toLowerCase().startsWith("win")) {
			basePath="D:/projectdev/image/";
		}else {
			basePath="/Users/bihaoran460/image/";
		}
		basePath=basePath.replace("/", seperator);
		return basePath;
	}
}
