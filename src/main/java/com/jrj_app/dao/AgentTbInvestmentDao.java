package com.jrj_app.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.jrj_app.bean.AgentTbInvestmentEntity;

@Transactional
public interface AgentTbInvestmentDao extends CrudRepository<AgentTbInvestmentEntity,Integer>{

}
