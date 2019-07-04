package com.parseurl;

import java.net.MalformedURLException; //����java.net���е��쳣��
import java.net.URL; //����URL��

public class Ex91_1_ParseURL {

	public static void main(String[] args) {
		URL sampleURL = null;
		try {
			sampleURL = new URL("http://www.sina.com.cn:80/index.html"); //����URL����
		} catch (MalformedURLException e) { //�쳣����
			e.printStackTrace();
		}
		//��ʾsampleURL���������ֵ
		System.out.println("Э�飺" + sampleURL.getProtocol());
		System.out.println("��������" + sampleURL.getHost());
		System.out.println("�˿ںţ�" + sampleURL.getPort());
		System.out.println("�ļ�����" + sampleURL.getFile());
		
		//public String getRef():��ȡURL�������ļ��е����λ�ã�����URL��������ã�ê��
		System.out.println("ê�㣺" + sampleURL.getRef());
	}
}
