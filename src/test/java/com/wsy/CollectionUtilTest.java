package com.wsy;

import java.util.ArrayList;

import org.junit.Test;

import com.wsy.common.CollectionUtil;

public class CollectionUtilTest {
	@Test
	public void test() {
		
		ArrayList list=new ArrayList();
		
		System.out.println(CollectionUtil.haslength(list));
	}
}
