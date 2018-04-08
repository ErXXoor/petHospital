package org.petHospital.service.implement;

import java.util.List;

import org.petHospital.mapper.CategoryMapper;
import org.petHospital.model.Category;
import org.petHospital.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements CategoryService{
	@Autowired
	private CategoryMapper categoryMapper;
	
	public List<Category> findAllCategory(){
		return categoryMapper.findAllCategory();
	}

}
