package org.petHospital.mapper;

import java.util.List;

import org.petHospital.model.UserEntity;
import org.springframework.stereotype.Repository;

//@Repository
public interface UserMapper {
	List<UserEntity> getAll();

    UserEntity getOne(Long id);

    void insert(UserEntity user);

    void update(UserEntity user);

    void delete(Long id);

}
