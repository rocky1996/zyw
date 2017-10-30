package com.acat.service.impl;

import java.util.List;

import com.acat.dao.OrgStuDao;
import com.acat.dao.impl.OrgStuDaoImpl;
import com.acat.pojo.OrgStu;
import com.acat.service.OrgStuService;
import com.acat.util.getNowTime;

public class OrgStuServiceImpl implements OrgStuService{
	private OrgStuDao osd = new OrgStuDaoImpl();
	@Override
	public void addOrgStu(OrgStu os) {
		os.setTime(getNowTime.getTime());
		osd.addOrgStu(os);
	}

	@Override
	public void deleteOrgStu(int orgid) {
		osd.deleteOrgStu(orgid);		
	}

	@Override
	public void updateOrgStu(OrgStu os) {
		osd.updateOrgStu(os);
	}
	
	@Override
	public List<OrgStu> findAll() {
		return osd.findAll();
	}

	@Override
	public OrgStu findOrgStu(int orgid) {
		return osd.findOrgStu(orgid);
	}

}
