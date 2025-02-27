package com.xworkz.sports.sport;

import com.xworkz.sports.config.SpringSportsConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class SportsRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(SpringSportsConfig.class);

     Sports sports = applicationContext.getBean(Sports.class);

       sports.id = 1;
       sports.SportsName = "Cricket";
        System.out.println( sports.id + "  " +  sports.SportsName );
        System.out.println(sports);

        sports.id = 2;
        sports.SportsName ="VallyBoll";
        System.out.println(sports.id + "  " +  sports.SportsName);
        System.out.println(sports);

        sports.type = "Outdoor";
        sports.numberOfPlayers = 12;
        System.out.println(sports.type + " " + sports.numberOfPlayers);

        sports.originCountry = "England";
        sports.popularityRank = 1;
        System.out.println(sports.originCountry + " " +sports.popularityRank);
        System.out.println(sports);

        sports.rules = "Two teams aim to score goals using a ball";
        sports.durationInMinutes = 90;
        System.out.println(sports.rules + " "+ sports.durationInMinutes);

        sports.skillLevel = "Intermediate";
        sports.governingBody = "FIFA";
        System.out.println(sports.skillLevel + " "+sports.governingBody);
        System.out.println(sports);

        sports.isTeamSport = true;
        sports.season = "All Year";
        System.out.println(sports.isTeamSport + " "+ sports.season);
        System.out.println(sports);

       List equipment = applicationContext.getBean("getequipment", List.class);
        System.out.println(equipment);
        System.out.println(sports);


        List<String> majorTournaments = applicationContext.getBean("getmajorTournaments",List.class);
        System.out.println(majorTournaments);

        List<String> popularityRegions = applicationContext.getBean("getmajorTournaments", List.class);
        System.out.println(popularityRegions);
        System.out.println(sports);

     List<String> Name = applicationContext.getBean("getListOfName",List.class);
     System.out.println(Name);

     List Season = applicationContext.getBean("getListOfSeason",List.class);
     System.out.println(Season);

     List<Integer> id = applicationContext.getBean("getListOfId",List.class);
     System.out.println(id);

     List<Integer> players = applicationContext.getBean("getListNoOfPlayers",List.class);
     System.out.println(players);

     List<Integer>duration = applicationContext.getBean("getDurationInMinutes",List.class);
     System.out.println(duration);

     List<String>OriginCountry = applicationContext.getBean("getOriginCountry", List.class);
     System.out.println(OriginCountry);

     List<Float> value = applicationContext.getBean("getListOffloat", List.class);
     System.out.println(value);
    }
}
