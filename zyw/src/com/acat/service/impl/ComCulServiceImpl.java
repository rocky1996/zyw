package com.acat.service.impl;

import java.util.List;

import com.acat.dao.ComCulDao;
import com.acat.dao.impl.ComCulDaoImpl;
import com.acat.pojo.ComCul;
import com.acat.service.ComCulService;
import com.acat.util.getNowTime;

public class ComCulServiceImpl implements ComCulService{
	private ComCulDao ccd = new ComCulDaoImpl();
	@Override
	public void addComcul(ComCul cc) {
		cc.setTime(getNowTime.getTime());
		ccd.addComcul(cc);
		
	}

	@Override
	public void deleteComCul(int comid) {
		ccd.deleteComCul(comid);		
	}

	@Override
	public void updateComCul(ComCul cc) {
		ccd.updateComCul(cc);	
	}

	@Override
	public List<ComCul> findAll() {
		return ccd.findAll();
	}

	@Override
	public ComCul findComCul(int comid) {
		return ccd.findComCul(comid);
	}

}
