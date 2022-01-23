package com.example.demo.DTO;

public class MatchMakingRequestDTO {
    private Long userid;
    private Long gameid;

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getGameid() {
        return gameid;
    }

    public void setGameid(Long gameid) {
        this.gameid = gameid;
    }
}
