package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.IEmpDao;
import com.accp.pojo.Emp;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
@Service
public class EmpBiz {
	@Autowired
	private IEmpDao dao;
	
	public List<Emp> queryAll(Integer id){
		/* PageHelper.startPage(1, 2); */
		return dao.queryAll(id);
	}
	
	public int deleteEmp(int id) {
		return dao.deleteEmp(id);
	}
	
}
