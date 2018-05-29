package com.jrj_app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrj_app.bean.AgentTbInvestmentEntity;
import com.jrj_app.service.AgentTbInvestmentService;

@RestController
public class AgentTbInvestmentController {

	@Resource
	private AgentTbInvestmentService agentTbInvestmentService;
	
	@RequestMapping("/jrj/findAllTbInvestment")
	public Map findAll(){
        List<AgentTbInvestmentEntity> list = agentTbInvestmentService.findAll();
        
        Map json = new HashMap();
		Map data = new HashMap();
		data.put("investmentList",list);
		json.put("data", data);
		json.put("success",true);
		
        return json;
    }
}
