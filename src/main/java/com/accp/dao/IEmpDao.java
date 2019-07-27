package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Emp;

public interface IEmpDao {

	List<Emp> queryAll(@Param("id")int id);

	int deleteEmp(@Param("id")int id);

}