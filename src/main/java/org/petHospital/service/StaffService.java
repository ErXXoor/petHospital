package org.petHospital.service;

import java.util.List;

import org.petHospital.model.Staff;

public interface StaffService {
    Integer saveStaff(Staff staff);

    List<Staff> getAllStaff();

    Staff getStaff(String name);

    void deleteStaff(Integer id);

    void updateStaff(Staff staff);

}
