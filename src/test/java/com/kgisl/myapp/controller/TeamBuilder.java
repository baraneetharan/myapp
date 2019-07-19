package com.kgisl.myapp.controller;

import com.kgisl.myapp.entity.Team;

/**
 * TeamBuilder
 */
public class TeamBuilder {

    Team team = new Team();

    private Long teamid;
    private String teamname;

    /**
     * @return the teamid
     */
    public TeamBuilder getTeamid(Long l) {
        team.setTeamid(l);
        return this;
    }

    public TeamBuilder name(String name) {
        team.setTeamname(name);
        return this;
    }

    public Team build() {
        return team;
    }
}