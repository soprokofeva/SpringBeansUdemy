package org.example.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String getTeam() {
        return team;
    }

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Swim apr. 1 hour";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
