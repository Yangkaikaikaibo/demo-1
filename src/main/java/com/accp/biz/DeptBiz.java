package com.accp.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.IDeptDao;
import com.accp.pojo.Dept;
@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class DeptBiz {
	
	@Resource
	private IDeptDao dao;
	
	
	public List<Dept> queryAll(){
		return dao.queryAll();
	}
}
