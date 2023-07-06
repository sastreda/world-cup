package com.sportradar.sastre.football.model;

import java.sql.Timestamp;
import java.time.Instant;

public class Match {
    Timestamp startDate;
    Country homeTeam;
    int homeScore;
    Country awayTeam;
    int awayScore;

    public Match (Country homeTeam, Country awayTeam){
        this.startDate = Timestamp.from(Instant.now());
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Timestamp getStartDate() {
        return startDate;
    }

    public Country getHomeTeam() {
        return homeTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public Country getAwayTeam() {
        return awayTeam;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    @Override
    public String toString() {
        return new StringBuilder().append(homeTeam).append(" ").append(homeScore).append(" : ")
                .append(awayTeam).append(" ").append(awayScore)
                .toString();
    }
    //TODO compare --> 1. goals 2. most recent started first
}
