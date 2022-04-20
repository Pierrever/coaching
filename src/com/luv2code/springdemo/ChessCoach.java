package com.luv2code.springdemo;

public class ChessCoach implements Coach {
    @Override
    public String getDailyFortune() {
        return "sachovddkadd";
    }

    @Override
    public String getDailyWorkout() {
        return "d4 d5";
    }

    private FortuneService fs;
    public ChessCoach(FortuneService tfs) {
        fs = tfs;
    }
}
