package com.sportradar.sastre.football.model;

import com.sportradar.sastre.football.Country;

import java.sql.Timestamp;
import java.time.Instant;

public class Match {
    Timestamp startDate;
    Country homeTeam;
    int homeScore;
    Country awayTeam;
    int awayScore;

    public Match (String homeTeam, String awayTeam){
        this.startDate = Timestamp.from(Instant.now());
        this.homeTeam = Country.valueOf(homeTeam.toUpperCase());
        this.awayTeam = Country.valueOf(awayTeam.toUpperCase());
        this.homeScore = 0;
        this.awayScore = 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    //TODO compare --> 1. goals 2. most recent started first

    //TODO override isEqual
    // a == a and a == b or a == b and b==a
}
