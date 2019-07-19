package com.kgisl.myapp.controller;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.kgisl.myapp.entity.Team;
import com.kgisl.myapp.service.TeamService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.ResponseEntity;

/**
 * TeamControllerTest
 */
@RunWith(MockitoJUnitRunner.class)

public class TeamControllerTest {
    @Mock
    private TeamService teamService;
    @InjectMocks
    private TeamController teamController;

    public Team team1 = new TeamBuilder().getTeamid(1L).name("mahesh").build();
    public Team team2 = new TeamBuilder().getTeamid(2L).name("aravinth").build();

    @Test

    public void alltest() {
        List<Team> expected = Arrays.asList(team1, team2);

        when(teamService.getTeams()).thenReturn(expected);
        ResponseEntity<List<Team>> actual = teamController.all();
        System.out.println(actual.getBody());
        assertEquals(expected, actual.getBody());

    }

}