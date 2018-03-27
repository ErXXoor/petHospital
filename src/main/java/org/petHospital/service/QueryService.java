package org.petHospital.service;

import org.petHospital.model.User;
import org.petHospital.model.UserEntity;

public interface QueryService {
	User getOne(String id);
}
