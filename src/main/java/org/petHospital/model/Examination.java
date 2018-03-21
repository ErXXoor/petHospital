package org.petHospital.model;

public class Examination {
    private Integer id;

    private String examinationName;

    private Float examinationPrice;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExaminationName() {
        return examinationName;
    }

    public void setExaminationName(String examinationName) {
        this.examinationName = examinationName == null ? null : examinationName.trim();
    }

    public Float getExaminationPrice() {
        return examinationPrice;
    }

    public void setExaminationPrice(Float examinationPrice) {
        this.examinationPrice = examinationPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}