package com.zhy.vo;

public class SubType {
    private Integer stid;
    private String title;
    private Integer tid;
    private Type type;

    public Integer getStid() {
        return stid;
    }

    public void setStid(Integer stid) {
        this.stid = stid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public String toString() {
        return "SubType{" +
                "stid=" + stid +
                ", title='" + title + '\'' +
                ", tid=" + tid +
                ", type=" + type +
                '}';
    }
}
