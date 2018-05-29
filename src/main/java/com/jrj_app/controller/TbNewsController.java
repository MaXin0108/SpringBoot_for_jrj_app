package com.jrj_app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrj_app.bean.AgentTbInvestmentEntity;
import com.jrj_app.bean.TbNewsEntity;
import com.jrj_app.service.TbNewsService;

@RestController
public class TbNewsController {
	@Resource
	private TbNewsService tbNewsService;
	
	@RequestMapping("/jrj/findAllTbNews")
	public Map findAll(){
		List list = tbNewsService.findAll();
        
        Map json = new HashMap();
		Map data = new HashMap();
		data.put("tbNewList",list);
		json.put("data", data);
		json.put("success",true);
		
        return json;
    }

}
