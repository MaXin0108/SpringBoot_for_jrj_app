package com.jrj_app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jrj_app.bean.AgentTbLoanEntity;
import com.jrj_app.dao.AgentTbLoanDao;

@Service
public class AgentTbLoanService {

	@Resource
	private AgentTbLoanDao agentTbLoanDao;
	
	public List<AgentTbLoanEntity> findAll(){
		return (List<AgentTbLoanEntity>) agentTbLoanDao.findAll();
	}
}
