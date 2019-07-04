package com.parseurl;

import java.net.MalformedURLException; //引入java.net包中的异常类
import java.net.URL; //引入URL类

public class Ex91_1_ParseURL {

	public static void main(String[] args) {
		URL sampleURL = null;
		try {
			sampleURL = new URL("http://www.sina.com.cn:80/index.html"); //创建URL对象
		} catch (MalformedURLException e) { //异常处理
			e.printStackTrace();
		}
		//显示sampleURL对象各属性值
		System.out.println("协议：" + sampleURL.getProtocol());
		System.out.println("主机名：" + sampleURL.getHost());
		System.out.println("端口号：" + sampleURL.getPort());
		System.out.println("文件名：" + sampleURL.getFile());
		
		//public String getRef():获取URL对象在文件中的相对位置，返回URL对象的引用（锚）
		System.out.println("锚点：" + sampleURL.getRef());
	}
}
