package com.zhy.vo;

import java.io.Serializable;
import java.util.List;

public class Type implements Serializable {
    private Integer tid;
    private String title;
    private List<SubType> subTypeList;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<SubType> getSubTypeList() {
        return subTypeList;
    }

    public void setSubTypeList(List<SubType> subTypeList) {
        this.subTypeList = subTypeList;
    }

    @Override
    public String toString() {
        return "Type{" +
                "tid=" + tid +
                ", title='" + title + '\'' +
                ", subTypeList=" + subTypeList +
                '}';
    }
}
