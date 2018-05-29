package com.jrj_app.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.jrj_app.bean.TbNewsEntity;

@Transactional
public interface TbNewsDao extends CrudRepository<TbNewsEntity,Integer>{
	public List<TbNewsEntity> findAll();
}
