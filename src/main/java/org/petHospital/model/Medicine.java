package org.petHospital.model;

public class Medicine {
    private Integer id;

    private String medicineName;

    private Float medicinePrice;

    private Integer medicineType;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public Float getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(Float medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public Integer getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(Integer medicineType) {
        this.medicineType = medicineType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}