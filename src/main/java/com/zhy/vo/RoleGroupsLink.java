package com.zhy.vo;

import java.io.Serializable;

public class RoleGroupsLink implements Serializable{
    private Role role;
    private Groups groups;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "RoleGroupsLink{" +
                "role=" + role +
                ", groups=" + groups +
                '}';
    }
}
