package com.xworkz.app.patient.media;


import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
//@Component

public class News {

    public Media media;

    public void getMediaDetails(){
        this.media.getNews();
    }
}
