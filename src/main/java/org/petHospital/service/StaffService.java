package org.petHospital.service;

public interface StaffService {
	Integer addStaff(String name, int room, String title);
	int deleteStaff(Integer id);
}
