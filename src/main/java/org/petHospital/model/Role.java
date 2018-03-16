package org.petHospital.model;

public class Role {
    private Integer id;

    private String roomAccess;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomAccess() {
        return roomAccess;
    }

    public void setRoomAccess(String roomAccess) {
        this.roomAccess = roomAccess == null ? null : roomAccess.trim();
    }
}