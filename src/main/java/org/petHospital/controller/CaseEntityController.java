package org.petHospital.controller;

import java.util.List;

import org.petHospital.model.CaseEntity;
import org.petHospital.model.CaseResource;
import org.petHospital.model.Category;
import org.petHospital.service.CaseEntityService;
import org.petHospital.service.CaseResourceService;
import org.petHospital.service.CategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.sf.json.JSONObject;

@RestController
public class CaseEntityController {
	private Logger logger = LoggerFactory.getLogger(CaseEntityController.class);

	@Autowired
	private CaseEntityService caseEntityService;
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private CaseResourceService caseResourceService;

	/**
	 * 得到所有category
	 * @return
	 */
	@GetMapping(path="/getAllCategory")
	public String findAllCategory(){
		JSONObject json = new JSONObject();
		List<Category> list = categoryService.findAllCategory();
		json.put("retCode", "0000");
		json.put("categoryList",list);
		return json.toString();
	}
	
	/**
	 * 根据category_id得到caseentity
	 * @param id
	 * @return
	 */
	@PostMapping(path="/getCaseEntity")
	public String findAllCaseEntityByCategoryId(@RequestParam int id){
		JSONObject json = new JSONObject();
		List<CaseEntity> list = caseEntityService.findAllCaseEntityByCategoryId(id);
		json.put("retCode", "0000");
		json.put("caseEntityList", list);
		return json.toString();
	}
	
	/**
	 * 根据id获取病种描述
	 * @param id
	 * @return
	 */
	@PostMapping(path="/getCaseResource")
	public String getCaseResource(@RequestParam String id){
		JSONObject json = new JSONObject();
		
		CaseResource caseResource = caseResourceService.getCaseResource(Integer.parseInt(id));
		json.put("retCode", "0000");
		json.put("caseResource", caseResource);
		return json.toString();
	}	
	
}
