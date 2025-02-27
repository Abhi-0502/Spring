package com.xworkz.app.patient.candidateclass;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
//@Component
public class Candidate {

    @Value("1")
    public int classid;
    @Value("A")
    public String Section;

    public StudentClass studentClass;

    public Candidate(StudentClass studentClass){
        this.studentClass = studentClass;
    }

    public void getCandidate(){
        System.out.println( "class id :" +classid);
        System.out.println( "section :" + Section);
    }
}
