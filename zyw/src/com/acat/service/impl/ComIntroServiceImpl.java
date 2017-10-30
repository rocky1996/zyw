package com.acat.service.impl;

import java.util.Date;
import java.util.List;

import com.acat.dao.ComIntroDao;
import com.acat.dao.impl.ComIntroDaoImpl;
import com.acat.pojo.ComIntro;
import com.acat.service.ComIntroService;
import com.acat.util.getNowTime;

public class ComIntroServiceImpl implements ComIntroService{
	private ComIntroDao cid = new ComIntroDaoImpl();
	@Override
	public void addComIntro(ComIntro ci) {
		ci.setTime(getNowTime.getTime());
		cid.addComIntro(ci);		
	}

	@Override
	public void updateComIntro(ComIntro ci) {
		cid.updateComIntro(ci);		
	}

	@Override
	public void deleteComIntro(int comid) {
		cid.deleteComIntro(comid);
	}

	@Override
	public List<ComIntro> findAll() {
		return cid.findAll();
	}

	@Override
	public ComIntro findComIntro(int comid) {
		return cid.findComIntro(comid);
	}

}
