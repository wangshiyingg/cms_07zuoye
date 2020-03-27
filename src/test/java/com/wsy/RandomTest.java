package com.wsy;

import org.junit.Test;

import com.wsy.common.RandomUtil;

public class RandomTest {
	@Test
	public void testRandom()
	{
		int i = RandomUtil.random(1, 3);
		System.out.println(i);
	}
	@Test
	public void subRandom()
	{
		int[] is = RandomUtil.subRandom(1, 10, 3);
		for (int i : is) {
			System.out.println(i);
		}
	}
	@Test
	public void randomCharacter()
	{
		char x = RandomUtil.randomCharacter();
		System.out.println(x);
	}
	@Test
	public void randomString()
	{
		 String x = RandomUtil.randomString(4);
		System.out.println(x);
	}
	@Test
	public void getValue()
	{
		   boolean x = RandomUtil.getValue("111");
		System.out.println(x);
	}
	@Test
	public void getValuee()
	{
		   String x = RandomUtil.getValuee("王世英",1);
		System.out.println(x);
	}
}
