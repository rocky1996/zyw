package com.acat.dao;

import java.util.List;

import com.acat.pojo.ComIntro;

public interface ComIntroDao {
	void addComIntro(ComIntro ci);
	void updateComIntro(ComIntro ci);
	void deleteComIntro(int comid);
	List<ComIntro> findAll();
	ComIntro findComIntro(int comid);
	ComIntro findMaxComIntro();
}
