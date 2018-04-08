package org.petHospital.service.implement;

import org.petHospital.mapper.StaffMapper;
import org.petHospital.model.Staff;
import org.petHospital.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;

public class StaffServiceImp implements StaffService{
	@Autowired
	private StaffMapper staffMapper;
	
	public Integer addStaff(String name, int room, String title){
		Staff staff = new Staff();
		staff.setRoomId(room);
		staff.setStaffName(name);
		staff.setTitle(title);
		return staffMapper.insert(staff);
	}
	
	public int deleteStaff(Integer id){
		return staffMapper.deleteByPrimaryKey(id);
	}
}
