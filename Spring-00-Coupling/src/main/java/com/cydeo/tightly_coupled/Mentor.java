package com.cydeo.tightly_coupled;

import com.cydeo.loosely_coupled.FullTimeMentor;

public class Mentor {

    FullTimeMent fullTimeMentor;
    PartTimeMent partTimeMentor;

    //MI

    public Mentor(FullTimeMent fullTimeMentor, PartTimeMent partTimeMentor) { //MI
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        //MI
    }
}
