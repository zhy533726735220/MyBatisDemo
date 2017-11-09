package com.zhy.vo;

public class MemberLogin {
    private String mid;
    private String password;
    private MemberDetails memberDetails;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public MemberDetails getMemberDetails() {
        return memberDetails;
    }

    public void setMemberDetails(MemberDetails memberDetails) {
        this.memberDetails = memberDetails;
    }

    @Override
    public String toString() {
        return "MemberLogin{" +
                "mid='" + mid + '\'' +
                ", password='" + password + '\'' +
                ", memberDetails=" + memberDetails +
                '}';
    }
}
