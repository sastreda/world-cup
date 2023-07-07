package com.sportradar.sastre.football.model;

import java.sql.Timestamp;
import java.time.Instant;

public class Match implements Comparable<Match>{
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
        return homeTeam.getDescription() + " " + homeScore + " : " + awayTeam.getDescription() + " " + awayScore;
    }

    @Override
    public int compareTo(Match o) {
        int value = Integer.compare(o.homeScore + o.awayScore, homeScore + awayScore);
        if (value != 0) {
            return value;
        }
        else {
            return o.getStartDate().compareTo(startDate);
        }
    }
}
