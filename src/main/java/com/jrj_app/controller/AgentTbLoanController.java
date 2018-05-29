package com.jrj_app.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jrj_app.bean.AgentTbLoanEntity;
import com.jrj_app.service.AgentTbLoanService;

@RestController
public class AgentTbLoanController {

	@Resource
	private AgentTbLoanService agentTbLoanService;
	
	@RequestMapping("/jrj/findAllTbLoan")
	public Map findAll(){
		List list = agentTbLoanService.findAll();
		Map json = new HashMap();
		Map data = new HashMap();
		data.put("loanList",list);
		json.put("data", data);
		json.put("success",true);
		
        return json;
    }
}
