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
	public List<Category> findAllCategory(){
		return categoryService.findAllCategory();
	}
	
	/**
	 * 根据category_id得到caseentity
	 * @param id
	 * @return
	 */
	@PostMapping(path="/getCaseEntity")
	public List<CaseEntity> findAllCaseEntityByCategoryId(@RequestParam int id){
		return caseEntityService.findAllCaseEntityByCategoryId(id);
	}
	
	/**
	 * 根据id获取病种描述
	 * @param id
	 * @return
	 */
	@PostMapping(path="/getCaseResource")
	public CaseResource getCaseResource(@RequestParam String id){
		return caseResourceService.getCaseResource(Integer.parseInt(id));
	}	
	
}
