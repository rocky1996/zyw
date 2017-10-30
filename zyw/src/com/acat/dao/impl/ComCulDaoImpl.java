package com.acat.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.acat.dao.ComCulDao;
import com.acat.pojo.ComCul;
import com.acat.util.DbcpUtil;

public class ComCulDaoImpl implements ComCulDao{
	private QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());
	@Override
	public void addComcul(ComCul cc) {
		try{
			qr.update("insert into zyw_com_cul(introduction,pricutre,time) values(?,?,?)",cc.getIntroduction(),cc.getPricutre(),cc.getTime());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public void deleteComCul(int comid) {
		try{
			qr.update("delete from zyw_com_cul where comid=?",comid);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateComCul(ComCul cc) {
		try{
			qr.update("update zyw_com_cul set introduction=?,pricutre=?,time=? where comid=?",cc.getIntroduction(),cc.getPricutre(),cc.getTime(),cc.getComid());
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public List<ComCul> findAll() {
		try{
			return qr.query("select * from zyw_com_cul", new BeanListHandler<ComCul>(ComCul.class));
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public ComCul findComCul(int comid) {
		try{
			return qr.query("select * from zyw_com_cul where comid=?",new BeanHandler<ComCul>(ComCul.class),comid);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
	}

}
