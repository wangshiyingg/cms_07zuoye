package com.wsy.test;

import java.util.Date;

import com.wsy.common.RandomUtil;
import com.wsy.common.StringUtil;
import com.wsy.domain.Person;

public class PersonTest {

	 @org.junit.Test
	 public  void sc() {
		 int i=1;
		 while(i<=10000) {
			 Person p=new Person();
		String name=StringUtil.generateChineseName();
		int age=RandomUtil.random(1, 120);
		 String about=StringUtil.randomChineseString(140);
		 p.setName(name);
		 p.setAge(age);
		 p.setAbout(about);
		 p.setzDate(new Date());
		 System.out.println(i+"   "+p);
		  i++;
		 }
	 }
}
