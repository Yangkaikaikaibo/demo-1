package com.accp.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.DeptBiz;
import com.accp.pojo.Dept;

@RestController
@RequestMapping("deptapi")
public class DeptAction {
	@Autowired
	private DeptBiz biz;
	
	@GetMapping("queryAll")
	public List<Dept> queryAll(){
		return biz.queryAll();
	}
}
