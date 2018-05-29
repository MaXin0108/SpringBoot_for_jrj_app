package com.jrj_app.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jrj_app.bean.TbNewsEntity;
import com.jrj_app.dao.TbNewsDao;

@Service
public class TbNewsService {

	@Resource
	private TbNewsDao tbNewsDao;
	
	public List<TbNewsEntity> findAll(){
		return tbNewsDao.findAll();
	}
}
