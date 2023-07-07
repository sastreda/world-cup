package com.sportradar.sastre.football.model;

public enum Country {
    MEXICO ("Mexico"),
    CANADA ("Canada"),
    SPAIN ("Spain"),
    BRAZIL("Brazil"),
    GERMANY ("Germany"),
    FRANCE ("France"),
    URUGUAY ("Uruguay"),
    ITALY ("Italy"),
    ARGENTINA ("Argentina"),
    AUSTRALIA ("Australia");

    private String description;

    Country(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
