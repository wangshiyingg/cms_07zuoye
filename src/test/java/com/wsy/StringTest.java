package com.wsy;

import org.junit.Test;

import com.wsy.common.RandomUtil;
import com.wsy.common.StringUtil;

public class StringTest {
	@Test
	public void hasLength()
	{
		
		String str = "abc";//有值
		boolean b = StringUtil.hasLength(str);
		System.out.println(b);
	}
	@Test
	public void testHasText() {
		
		String str = " ";//没值
		boolean b = StringUtil.hasText(str);
		System.out.println(b);	
	}
	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(3);
		System.out.println(string);
	}
	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}
}
