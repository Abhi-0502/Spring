package com.xworkz.app.patient.moon;

import com.xworkz.app.patient.mobile.Sim;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
//@Component
public class Moon {



    @Value("01")
        public int id;
        @Value("150 million")
        public  String SunDistance;

        public Sun sun;

        public Moon(Sun sun){
            this.sun = sun;
        }

        public void getmoon(){
            System.out.println("id is :" + id);
            System.out.println("sundistance to moon :" + SunDistance);
        }

    }
