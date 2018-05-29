package com.jrj_app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jrj_app.bean.AgentTbInvestmentEntity;
import com.jrj_app.dao.AgentTbInvestmentDao;

@Service
public class AgentTbInvestmentService {

	@Resource
	private AgentTbInvestmentDao agentTbInvestmentDao;
	
	public List<AgentTbInvestmentEntity> findAll(){
		return (List<AgentTbInvestmentEntity>) agentTbInvestmentDao.findAll();
	}
}
