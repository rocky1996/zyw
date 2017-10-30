package com.acat.dao;

import java.util.List;

import com.acat.pojo.ComCul;

public interface ComCulDao {
	void addComcul(ComCul cc);
	void deleteComCul(int comid);
	void updateComCul(ComCul cc);
	List<ComCul> findAll();
	ComCul findComCul(int comid);
}
