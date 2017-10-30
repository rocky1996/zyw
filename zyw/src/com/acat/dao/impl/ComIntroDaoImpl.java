package com.acat.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.acat.dao.ComIntroDao;
import com.acat.pojo.ComIntro;
import com.acat.util.DbcpUtil;

public class ComIntroDaoImpl implements ComIntroDao{
	private QueryRunner qr = new QueryRunner(DbcpUtil.getDataSource());
	@Override
	public void addComIntro(ComIntro ci) {
		try{
			qr.update("insert into zyw_com_intro(time,title,control) values(?,?,?)",ci.getTime(),ci.getTitle(),ci.getControl());
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public void updateComIntro(ComIntro ci) {
		try{
			qr.update("update zyw_com_intro set time=? title=? where comid=?",ci.getTime(),ci.getTitle(),ci.getControl(),ci.getComid());
		}catch(Exception e){
			throw new RuntimeException(e);
		}	
	}

	@Override
	public void deleteComIntro(int comid) {
		try{
			qr.update("delete from zyw_com_intro where comid=?",comid);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		
	}

	@Override
	public List<ComIntro> findAll() {
		try{
			return qr.query("select * from zyw_com_intro", new BeanListHandler<ComIntro>(ComIntro.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public ComIntro findComIntro(int comid) {
		try{
			return qr.query("select * from zyw_com_intro where comid = ?", new BeanHandler<ComIntro>(ComIntro.class),comid);
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

	@Override
	public ComIntro findMaxComIntro() {
		try{
			return qr.query("select * from zyw_com_intro where comid = (select max(comid) from zyw_com_intro)", new BeanHandler<ComIntro>(ComIntro.class));
		}catch(Exception e){
			throw new RuntimeException(e);
		}
	}

}
