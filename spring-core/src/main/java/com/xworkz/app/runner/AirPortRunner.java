package com.xworkz.app.runner;

import com.xworkz.app.configure.SpringConfiguration;
import com.xworkz.app.patient.Airport;
import com.xworkz.app.patient.Terminal;
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
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AirPortRunner {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        System.out.println("..........................................");
        Airport airport = applicationContext.getBean(Airport.class);
        Terminal terminal = airport.terminal;
       System.out.println("The terminal is" + terminal.getTerminalName());
       System.out.println(airport.airPortName);
        airport.getTerminal();
        System.out.println("********************************************");

        System.out.println(".................................................");
        PoliceStation policeStation = applicationContext.getBean(PoliceStation.class);
      Police police = policeStation.police;
        System.out.println("The address " + policeStation.StationAddress);
       System.out.println(policeStation.StationAddress);
       System.out.println(police.Salary);
        policeStation.addStationAddress();
        System.out.println("*****************************************************");

        System.out.println(".............................................");
        Tv tv = applicationContext.getBean(Tv.class);
        Remote remote = tv.remote;
        System.out.println(tv.TvName);
       System.out.println(remote.id);
        tv.tvdetails();
        System.out.println("*********************************************");

        System.out.println("........................................");
        Media media = applicationContext.getBean(Media.class);
        News news = media.news;
        System.out.println(media.Name);
        System.out.println(media.id);
        media.getNews();
        System.out.println("********************************************");

        System.out.println(".........................................");
        Shares shares = applicationContext.getBean(Shares.class);
        Stocks stocks = shares.stocks;
        System.out.println(shares.SharesId);
        System.out.println(shares.type);
        shares.getshares();
        System.out.println("*************************************************");

        System.out.println("..............................................");
        Bank bank = applicationContext.getBean(Bank.class);
        Manager manager = bank.manager;
        System.out.println(bank.BankId);
        System.out.println(bank.BankName);
        bank.getBankDetails();
        System.out.println("************************************************");

        System.out.println(".........................................");
        Defence defence = applicationContext.getBean(Defence.class);
        Soldiers soldiers = defence.getSoldiers();
        defence.getDetails();
        System.out.println("***************************************");

        System.out.println("..........................................");
        Former former = applicationContext.getBean(Former.class);
        Property property = former.property;
        former.getproperty();
        System.out.println("*****************************************************");

        System.out.println("...........................................................");
        Franchise franchise = applicationContext.getBean(Franchise.class);
        IPL ipl = franchise.iPl;
        franchise.getfranchise();
        System.out.println("*************************************************");

        System.out.println("................................................");
        Mobile mobile = applicationContext.getBean(Mobile.class);
        Sim sim = mobile.sim;
        mobile.getmobile();
        System.out.println("**********************************************");

        System.out.println(".................................................");
        Moon moon = applicationContext.getBean(Moon.class);
        Sun sun = moon.sun;
        moon.getmoon();
        System.out.println("****************************************************");

        System.out.println("..............................................");
        Bar bar = applicationContext.getBean(Bar.class);
        Pivot pivot = bar.pivot;
        bar.getbar();
        System.out.println("*************************************************");

        System.out.println(".....................................................");
        Candidate candidate = applicationContext.getBean(Candidate.class);
        StudentClass Class = candidate.studentClass;
        candidate.getCandidate();
        System.out.println("********************************************************");

        System.out.println("...............................................");
        FashionDesigner fashionDesigner = applicationContext.getBean(FashionDesigner.class);
        Model model = fashionDesigner.model;
        fashionDesigner.getDetails();
        System.out.println("*******************************************************");

        System.out.println(".........................................................");
        Burjkhalifa burjkhalifa = applicationContext.getBean(Burjkhalifa.class);
        NoOfFloors noOfFloors = burjkhalifa.noOfFloors;
        burjkhalifa.getBurjkhalifa();
        System.out.println("**********************************************************");

        System.out.println("............................................................");
        Ambanigroups ambanigroups = applicationContext.getBean(Ambanigroups.class);
        MumbaiIndians mumbaiIndians = ambanigroups.mumbaiIndians;
        ambanigroups.getAmbanigroup();
        System.out.println("******************************************************");

        System.out.println("..............................................................");
        Beauticion beauticion = applicationContext.getBean(Beauticion.class);
        Parlour parlour = beauticion.parlour;
        beauticion.getbeauticion();
        System.out.println("***********************************************************");

        System.out.println("................................................");
        Games games = applicationContext.getBean(Games.class);
        PlayStation playStation = games.playStation;;
        games.getplays();
        System.out.println("*****************************************************");

        System.out.println(".....................................................");
        Kaveri kaveri = applicationContext.getBean(Kaveri.class);
        Tamilnadu tamilnadu = kaveri.tamilnadu;
        kaveri.getkaveri();
        System.out.println("*******************************************************");

        System.out.println(".....................................................");
        Passport passport = applicationContext.getBean(Passport.class);
        Visa visa = passport.visa;
        passport.getpassport();
        System.out.println("**************************************************");

        System.out.println("..........................................................");
        Channel channel = applicationContext.getBean(Channel.class);
        YouTube youTube = channel.youTube;
        channel.getchannel();
        System.out.println("***********************************************************");
        

    }
}
