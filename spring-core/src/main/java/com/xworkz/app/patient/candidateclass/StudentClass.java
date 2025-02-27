package com.xworkz.app.patient.candidateclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Component
public class StudentClass {

    public Candidate candidate;

    public void getclass(){
        this.candidate.getCandidate();
    }
}
