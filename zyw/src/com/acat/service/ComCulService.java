package com.acat.service;

import java.util.List;

import com.acat.pojo.ComCul;

public interface ComCulService {
	void addComcul(ComCul cc);
	void deleteComCul(int comid);
	void updateComCul(ComCul cc);
	List<ComCul> findAll();
	ComCul findComCul(int comid);
}
