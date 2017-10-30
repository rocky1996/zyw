package com.acat.service;

import java.util.List;

import com.acat.pojo.OrgStu;

public interface OrgStuService {
	void addOrgStu(OrgStu os);
	void deleteOrgStu(int orgid);
	void updateOrgStu(OrgStu os);
	List<OrgStu> findAll();
	OrgStu findOrgStu(int orgid);
}
