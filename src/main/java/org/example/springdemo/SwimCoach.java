package org.example.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    private FortuneService fortuneService;

    public SwimCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swim 1000 as a warm up";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
