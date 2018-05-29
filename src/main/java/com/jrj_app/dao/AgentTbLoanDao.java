package com.jrj_app.dao;


import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.jrj_app.bean.AgentTbLoanEntity;

@Transactional
public interface AgentTbLoanDao extends CrudRepository<AgentTbLoanEntity,Integer>{
	

}
