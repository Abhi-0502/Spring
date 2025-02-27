package com.xworkz.sports.sport;

import org.springframework.core.style.ToStringCreator;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class Sports {

    public int id;
    public String SportsName;
    public String type; // e.g., "Indoor", "Outdoor"
    public int numberOfPlayers;
    public String originCountry;
    public int popularityRank;
    public String rules;
    public int durationInMinutes;
    public String skillLevel;
    public String governingBody;
    public boolean isTeamSport;
    public String season;
    public List<String> equipment;
    public List<String> majorTournaments;
    public List<String> popularityRegions;
    public List<String> getListOfSeason;
    public List<Integer> getListOfId;
    public List<String> getListOfName;
    public List<Integer> getListNoOfPlayers;
    public  List<String> getoriginCountry;

    @Override
    public String toString() {
        return "Sports{" +
                "id=" + id +
                ", SportsName='" + SportsName + '\'' +
                ", type='" + type + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", originCountry='" + originCountry + '\'' +
                ", popularityRank=" + popularityRank +
                ", rules='" + rules + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", skillLevel='" + skillLevel + '\'' +
                ", governingBody='" + governingBody + '\'' +
                ", isTeamSport=" + isTeamSport +
                ", season='" + season + '\'' +
                ", equipment=" + equipment +
                ", majorTournaments=" + majorTournaments +
                ", popularityRegions=" + popularityRegions +
                ", getListOfSeason=" + getListOfSeason +
                ", getListOfId=" + getListOfId +
                ", getListOfName=" + getListOfName +
                ", getListNoOfPlayers=" + getListNoOfPlayers +
                ", getoriginCountry=" + getoriginCountry +
                '}';
    }
}
