package com.luv2code.springdemo;

public class TennisCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "go tenniska";
    }

    private FortuneService fortuneService;

    public TennisCoach(FortuneService thisfs) {
            fortuneService = thisfs;


    }
    @Override
    public String getDailyFortune() {
        return null;
    }
}
