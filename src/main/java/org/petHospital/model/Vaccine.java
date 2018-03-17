package org.petHospital.model;

public class Vaccine {
    private Integer id;

    private String vaccineName;

    private String vaccinePrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName == null ? null : vaccineName.trim();
    }

    public String getVaccinePrice() {
        return vaccinePrice;
    }

    public void setVaccinePrice(String vaccinePrice) {
        this.vaccinePrice = vaccinePrice == null ? null : vaccinePrice.trim();
    }
}