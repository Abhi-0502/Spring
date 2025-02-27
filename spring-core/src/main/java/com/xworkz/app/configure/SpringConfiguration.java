package com.xworkz.app.configure;


import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.app.patient.*;
import com.xworkz.app.patient.bank.Bank;
import com.xworkz.app.patient.bank.Manager;
import com.xworkz.app.patient.bar.Bar;
import com.xworkz.app.patient.bar.Pivot;
import com.xworkz.app.patient.candidateclass.Candidate;
import com.xworkz.app.patient.candidateclass.StudentClass;
import com.xworkz.app.patient.defence.Defence;
import com.xworkz.app.patient.defence.Soldiers;
import com.xworkz.app.patient.designer.FashionDesigner;
import com.xworkz.app.patient.designer.Model;
import com.xworkz.app.patient.dubai.Burjkhalifa;
import com.xworkz.app.patient.dubai.NoOfFloors;
import com.xworkz.app.patient.former.Former;
import com.xworkz.app.patient.former.Property;
import com.xworkz.app.patient.ipl.Franchise;
import com.xworkz.app.patient.ipl.IPL;
import com.xworkz.app.patient.media.Media;
import com.xworkz.app.patient.media.News;
import com.xworkz.app.patient.mobile.Mobile;
import com.xworkz.app.patient.mobile.Sim;
import com.xworkz.app.patient.moon.Moon;
import com.xworkz.app.patient.moon.Sun;
import com.xworkz.app.patient.mumbaiindians.Ambanigroups;
import com.xworkz.app.patient.mumbaiindians.MumbaiIndians;
import com.xworkz.app.patient.parlour.Beauticion;
import com.xworkz.app.patient.parlour.Parlour;
import com.xworkz.app.patient.playstation.Games;
import com.xworkz.app.patient.playstation.PlayStation;
import com.xworkz.app.patient.policestation.Police;
import com.xworkz.app.patient.policestation.PoliceStation;
import com.xworkz.app.patient.stocks.Shares;
import com.xworkz.app.patient.stocks.Stocks;
import com.xworkz.app.patient.tamilunadu.Kaveri;
import com.xworkz.app.patient.tamilunadu.Tamilnadu;
import com.xworkz.app.patient.tv.Remote;
import com.xworkz.app.patient.tv.Tv;
import com.xworkz.app.patient.visa.Passport;
import com.xworkz.app.patient.visa.Visa;
import com.xworkz.app.patient.youtube.Channel;
import com.xworkz.app.patient.youtube.YouTube;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Configuration
//java based config(@)
@ComponentScan(basePackages = "com.xworkz.app")

public class SpringConfiguration {

    public SpringConfiguration() {

    }

    @Bean
    public String getStringValue() {
        return "baba";

    }

    @Bean
    public boolean getuserStatus() {
        return true;
    }

    @Bean
    public int getflightId() {
        return 2;
    }

    @Bean
    public float getuservalue() {
        return 865;
    }

    @Bean
    public double getUserValue() {
        return 8.765;
    }

    @Bean
    public char getUservalue() {
        return 'a';
    }

    @Bean
    public short getuservalues() {
        return -32456;
    }

    @Bean
    public long getuserValues() {
        return 7654397654543l;
    }

    @Bean
    public byte getuserValue() {
        return -126;
    }

    @Bean
    public List<String> getListOfName() {
        List<String> Name = new ArrayList<String>();
        Name.add(new String("abhi"));
        Name.add(new String("megha"));
        Name.add(new String("swetha"));
        return Name;
    }

    @Bean
    public List<Integer> getListOfId() {
        List<Integer> ref = new ArrayList<Integer>();
        ref.add(new Integer(1));
        ref.add(new Integer(2));
        ref.add(new Integer(3));
        return ref;
    }

    @Bean
    public List<Float> getListOffloat() {
        List<Float> ref = new ArrayList<Float>();
        ref.add(new Float(1.0f));
        ref.add(new Float(2.0f));
        ref.add(new Float(3.0f));
        return ref;

    }


    @Bean
    public Patient patient(){
        Address address = getAddress();
        return new Patient(address);
    }

    @Bean
    public Address getAddress() {
        Country country = getCountry();
        Address address = new Address(country);
        address.addressName = "VijayNagar";
        return address;

    }

    @Bean
    public Country getCountry() {
        State state = getState();
        Country country = new Country(state);
        country.CountryName = "India";
        return country;

    }

    @Bean
    public State getState() {
        City city = getCity();
        State state = new State(city);
        state.stateName = "Karnataka";
        return state;
    }

    @Bean
    public City getCity() {
        Area area = getArea();
        City city = new City(area);
        city.cityName = "Bangalore";
        return city;
    }

    @Bean
    public Area getArea() {
        Area area = new Area();
        area.streetName = "2nd block";
        return area;
    }

    @Bean
    public Airport getAirport(){
        Terminal terminal = getTerminal();
        Airport airport = new Airport(terminal);
        return airport;
    }

    @Bean
    public Terminal getTerminal(){
        Terminal terminal = new Terminal();
        return terminal;
    }

    @Bean
    public PoliceStation getPoliceStation(){
        Police police = getPolice();
        PoliceStation policeStation = new PoliceStation(police);
        return policeStation;
    }

    @Bean
    public Police getPolice(){
        Police police = new Police();
        police.Salary="40000";
        return police;
    }

    @Bean
    public Tv getTv(){
        Remote remote = getRemote();
        Tv tv = new Tv(remote);
        return tv;
    }

    @Bean
    public Remote getRemote(){
        Remote remote = new Remote();
        return remote;
    }

    @Bean
    public Media getMedia(){
        News news = getNews();
        Media media = new Media(news);
        return media;
    }
    @Bean
    public News getNews(){
        News news = new News();
        return news;
    }

    @Bean
    public Shares getshares(){
        Stocks stocks = getStocks();
        Shares shares = new Shares(stocks);
        return shares;
    }

    @Bean
    public Stocks getStocks(){
        Stocks stocks = new Stocks();
        return stocks;
    }

    @Bean
    public Bank getBank(){
        Manager manager = getManager();
        Bank bank = new Bank(manager);
        return bank;
    }

    @Bean
    public Manager getManager(){
        Manager manager = new Manager();
        return manager;
    }

    @Bean
    public Defence getDefence(){
        Soldiers soldiers =  gerSolider();
        Defence defence = new Defence(soldiers);
        return defence;
    }
    @Bean
    public Soldiers gerSolider(){
        Soldiers soldiers = new Soldiers();
        return soldiers;
    }
    @Bean
    public Former getFormer(){
        Property property = getProperty();
        Former former = new Former(property);
        return former;
    }

    @Bean
    public Property getProperty(){
        Property property = new Property();
        return property;
    }

    @Bean
    public Franchise getFrancies(){
        IPL ipl = getIpl();
        Franchise franchise = new Franchise(ipl);
        return franchise;
    }

    @Bean
    public IPL getIpl(){
        IPL ipl = new IPL();
        return ipl;
    }

    @Bean
    public Mobile getmobile(){
        Sim sim = getSim();
        Mobile mobile = new Mobile(sim);
        return  mobile;
    }

    @Bean
    public Sim getSim(){
        Sim sim = new Sim();
        return sim;
    }

    @Bean
    public Moon getmoon(){
        Sun sun = getSun();
        Moon moon = new Moon(sun);
        return moon;
    }

    @Bean
    public Sun getSun(){
        Sun sun = new Sun();
        return sun;
    }

    @Bean
    public Bar getbar(){
        Pivot pivot = getpivot();
        Bar bar = new Bar(pivot);
        return  bar;
    }
    @Bean
    public Pivot getpivot(){
        Pivot pivot = new Pivot();
        return pivot;
    }

    @Bean
    public Candidate getcandidate(){
        StudentClass Class = getclass();
        Candidate candidate = new Candidate(Class);
        return candidate;
    }

    @Bean
    public StudentClass getclass(){
        StudentClass Class = new StudentClass();
        return Class;
    }

    @Bean
    public FashionDesigner getdesign(){
        Model model = getModel();
        FashionDesigner fashionDesigner = new FashionDesigner(model);
        return fashionDesigner;
    }

    @Bean
    public Model getModel(){
        Model model = new Model();
        return model;
    }

    @Bean
    public Burjkhalifa getburjkhalifa(){
        NoOfFloors noOfFloors = getfloor();
        Burjkhalifa burjkhalifa = new Burjkhalifa(noOfFloors);
        return burjkhalifa;
    }

    @Bean
    public NoOfFloors getfloor(){
        NoOfFloors noOfFloors = new NoOfFloors();
        return noOfFloors;
    }

    @Bean
    public Ambanigroups getgroup(){
        MumbaiIndians mumbaiIndians = getmumbai();
        Ambanigroups ambanigroups = new Ambanigroups(mumbaiIndians);
        return  ambanigroups;
    }

    @Bean
    public MumbaiIndians getmumbai(){
        MumbaiIndians mumbaiIndians = new MumbaiIndians();
        return mumbaiIndians;

    }

    @Bean
    public Beauticion getbeauticion(){
        Parlour parlour = getparlour();
        Beauticion beauticion = new Beauticion(parlour);
        return beauticion;
    }

    @Bean
    public Parlour getparlour(){
        Parlour parlour = new Parlour();
        return parlour;
    }

    @Bean
    public Games getgame(){
        PlayStation playStation = getplay();
        Games games = new Games(playStation);
        return games;
    }

    @Bean
    public PlayStation getplay(){
        PlayStation playStation = new PlayStation();
        return playStation;
    }

    @Bean
    public Kaveri getkaveri(){
        Tamilnadu tamilnadu = gettamil();
        Kaveri kaveri = new Kaveri(tamilnadu);
        return kaveri;
    }

    @Bean
    public Tamilnadu gettamil(){
        Tamilnadu tamilnadu = new Tamilnadu();
        return tamilnadu;
    }

    @Bean
    public Passport getpassport(){
        Visa visa = getvisa();
        Passport passport = new Passport(visa);
        return passport;
    }

    @Bean
    public Visa getvisa(){
        Visa visa = new Visa();
        return visa;
    }

    @Bean
    public Channel getChannel(){
        YouTube youTube = getyoutube();
        Channel channel = new Channel(youTube);
        return channel;
    }

    @Bean
    public YouTube getyoutube(){
        YouTube youTube = new YouTube();
        return youTube;
    }
}
