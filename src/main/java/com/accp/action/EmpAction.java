package com.accp.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.EmpBiz;
import com.accp.pojo.Emp;

@RestController
@RequestMapping("empapi")
public class EmpAction {
	
	@Resource
	private EmpBiz biz;
	
	@GetMapping("queryAll/{id}")
	public List<Emp> queryAll(@PathVariable Integer id){
		return biz.queryAll(id);
	}
	
	@DeleteMapping("deleteEmp/{id}")
	public int deleteEmp(@PathVariable Integer id) {
		return biz.deleteEmp(id);
	}
}
