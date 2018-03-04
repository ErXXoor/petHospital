package org.petHospital.service;

import org.petHospital.model.UserEntity;

public interface QueryService {
	UserEntity getOne(String id);
}
