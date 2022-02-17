package com.cydeo.tightly_coupled;

public class CydeoApp {

    public static void main(String[] args) {

       FullTimeMent fullTime = new FullTimeMent();
       PartTimeMent partTime = new PartTimeMent();

       Mentor mentor = new Mentor(fullTime,partTime);
       mentor.manageAccount();

    }


}
