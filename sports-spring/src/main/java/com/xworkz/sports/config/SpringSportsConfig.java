package com.xworkz.sports.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.xworkz.sports")
public class SpringSportsConfig {

    public SpringSportsConfig(){

    }

    @Bean
    public int getid(){
        return 1;
    }
    @Bean
    public String getSportsName(){
       return "Cricket";
    }
    @Bean
    public String gettype(){
        return "OutDoor";
    }
    @Bean
    public int getnumberOfPlayers(){
        return 11;
    }
    @Bean
    public String getoriginCountry(){
        return "England";
    }
    @Bean
    public int getpopularityRank(){
        return 1;
    }
    @Bean
    public String getrules(){
        return "true";
    }
    @Bean
    public int getdurationInMinutes(){
        return 90;
    }
    @Bean
    public String getskillLevel(){
        return "Intermediate";
    }
    @Bean
    public String getgoverningBody(){
        return "FiFA";
    }
    @Bean
    public boolean getisTeamSport(){
        return true;
    }
    @Bean
    public String getseason(){
        return "All Year";
    }
    @Bean
    public List<String> getequipment(){
        List<String> equipment = new ArrayList<String>();
        equipment.add(new String("Bat, Ball, Stumps, Gloves, Pads"));
        return equipment;
    }
   @Bean
    public List<String> getmajorTournaments(){
        List<String> majorTournaments = new ArrayList<String>();
        majorTournaments.add(new String("FIFA World Cup, UEFA Champions League"));
        return majorTournaments;
   }
   @Bean
    public List<String> getpopularityRegions(){
        List<String> popularityRegions = new ArrayList<String>();
       popularityRegions.add(new String("Europe, South America, Africa"));
       return popularityRegions;
   }
    @Bean
    public List<String> getListOfName(){
        List<String>  Name = new ArrayList<String>();

        Name.add(new String("abhi"));
        Name.add(new String("megha"));
        Name.add(new String("swetha"));
        Name.add(new String("bharath"));
        Name.add(new String("manu"));
        return Name;
    }

    @Bean
    public List<Integer> getListOfId() {
        List<Integer> ref = new ArrayList<Integer>();
        ref.add(new Integer(1));
        ref.add(new Integer(2));
        ref.add(new Integer(3));
        ref.add(new Integer(4));
        ref.add(new Integer(5));
        ref.add(new Integer(6));
        return ref;
    }

      @Bean
        public List<String> getListOfSeason() {
            List<String> ref = new ArrayList<String>();
        ref.add(new String("Winter"));
        ref.add(new String("Summer"));
        ref.add(new String("All Year"));
        return ref;
    }

    @Bean
    public List<Integer> getListNoOfPlayers(){
        List<Integer> ref = new ArrayList<>();
        ref.add(new Integer(11));
        ref.add(new Integer(14));
        ref.add(new Integer(12));
        ref.add(new Integer(13));
        ref.add(new Integer(10));
        return ref;

    }
    @Bean
    public List<Integer> getDurationInMinutes(){
        List<Integer> ref = new ArrayList<>();
        ref.add(new Integer(90));
        ref.add(new Integer(40));
        ref.add(new Integer(10));
        ref.add(new Integer(20));
        ref.add(new Integer(50));
        return ref;
    }

    @Bean
    public  List<String> getOriginCountry(){
        List<String> ref = new ArrayList<String>();
        ref.add(new String("India"));
        ref.add(new String("Rashya"));
        ref.add(new String("Japan"));
        ref.add(new String("Delhi"));
        ref.add(new String("USA"));
        return ref;
    }
    @Bean
    public List<Float> getListOffloat() {
        List<Float> ref = new ArrayList<Float>();
        ref.add(new Float(1.0f));
        ref.add(new Float(2.0f));
        ref.add(new Float(3.0f));
        ref.add(new Float(4.0f));
        ref.add(new Float(5.0f));
        ref.add(new Float(6.0f));
        ref.add(new Float(7.0f));
        return ref;
    }
}
