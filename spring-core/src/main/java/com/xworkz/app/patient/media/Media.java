package com.xworkz.app.patient.media;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component
public class Media {

    @Value("NewsFirst")
    public String Name;
    @Value("7")
    public int id;

   // @Autowired
    public News news;

    public Media(News news){
        this.news = news;
    }


    public void getNews(){
        System.out.println("Media Name :" + Name);
        System.out.println("id is :" + id);
    }
}
