package com.acat.dao.impl;

import java.sql.SQLException;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.acat.dao.OrgStuDao;
import com.acat.pojo.OrgStu;
import com.acat.util.DbcpUtil;

public class OrgStuDaoImpl implements OrgStuDao{
	private QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());
	@Override
	public void addOrgStu(OrgStu os) {
		try{
			qr.update("insert into zyw_org_stu(introduction,pricutre,time) values(?,?,?)",os.getIntroduction(),os.getPricutre(),os.getTime());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public void deleteOrgStu(int orgid) {
		try{
			qr.update("delete from zyw_org_stu where orgid=?",orgid);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateOrgStu(OrgStu os) {
		try{
			qr.update("update zyw_org_stu set introduction=?,pricutre=?,time=? where orgid=?",os.getIntroduction(),os.getPricutre(),os.getTime(),os.getOrgid());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<OrgStu> findAll() {
		try{
			return qr.query("select * from zyw_org_stu", new BeanListHandler<OrgStu>(OrgStu.class));
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public OrgStu findOrgStu(int orgid) {
		try{
			return qr.query("select * from zyw_org_stu where orgid=?",new BeanHandler<OrgStu>(OrgStu.class),orgid);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}
