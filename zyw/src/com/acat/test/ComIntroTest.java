package com.acat.test;

import org.junit.Test;

import com.acat.dao.ComIntroDao;
import com.acat.dao.impl.ComIntroDaoImpl;
import com.acat.pojo.ComIntro;

public class ComIntroTest {
	private ComIntroDao cd = new ComIntroDaoImpl();
	@Test
	public void test(){
		ComIntro ci = cd.findMaxComIntro();
		System.out.println(ci.getControl());
		System.out.println(ci.getTitle());
		System.out.println(ci.getTime());
	}
}
