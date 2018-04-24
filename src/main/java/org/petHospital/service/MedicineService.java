package org.petHospital.service;


import java.util.List;

import org.petHospital.model.Medicine;


public interface MedicineService {
    Integer saveMedicine(Medicine medicine);

    List<Medicine> getAllMedicine();

    Medicine getMedicine(String name);

    void deleteMedicine(Integer id);

    void updateMedicine(Medicine medicine);
}
