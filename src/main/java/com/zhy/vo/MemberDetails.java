package com.zhy.vo;

public class MemberDetails {
    private String mid;
    private String name;
    private Integer age;
    private MemberLogin  memberLogin;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public MemberLogin getMemberLogin() {
        return memberLogin;
    }

    public void setMemberLogin(MemberLogin memberLogin) {
        this.memberLogin = memberLogin;
    }

    @Override
    public String toString() {
        return "MemberDetails{" +
                "mid='" + mid + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", memberLogin=" + memberLogin +
                '}';
    }
}
