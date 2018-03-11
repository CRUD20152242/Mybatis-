package com.ccut.database;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.ccut.DAO.T;


public interface Mybatis_CRUD {
	
	public void deleteTByID(int id);
	public void updateTByID(T t);
	public void insertTByID(T t);
	public List<T> selectTByID(String name);

}
