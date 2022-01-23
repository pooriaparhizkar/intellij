package com.example.demo.DTO;

public class JoinTeamRequestDTO {
    private Long userid;
    private Long teamid;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }
}
