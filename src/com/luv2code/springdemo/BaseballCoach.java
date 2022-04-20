package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

    @Override
    public String getDailyFortune() {
       return fortuneService.getFortune();
    }

    private FortuneService fortuneService;

    public BaseballCoach (FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "go go go bc";
    }


}
