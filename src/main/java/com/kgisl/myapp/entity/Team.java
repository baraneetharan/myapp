package com.kgisl.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long teamid;

    private String teamname;

    private String nickname;

    /**
     * @return the teamid
     */
    public Long getTeamid() {
        return teamid;
    }

    /**
     * @param teamid the teamid to set
     */
    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }

    /**
     * @return the teamname
     */
    public String getTeamname() {
        return teamname;
    }

    /**
     * @param teamname the teamname to set
     */
    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }
    /**
     * @return the nickname
     */
    public String getNickname() {
        return nickname;
    }
    /**
     * @param nickname the nickname to set
     */
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}