package org.petHospital.model;

public class History {
    private Integer id;

    private String name;

    private String caseEntityId;

    private String methodId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCaseEntityId() {
        return caseEntityId;
    }

    public void setCaseEntityId(String caseEntityId) {
        this.caseEntityId = caseEntityId == null ? null : caseEntityId.trim();
    }

    public String getMethodId() {
        return methodId;
    }

    public void setMethodId(String methodId) {
        this.methodId = methodId == null ? null : methodId.trim();
    }
}