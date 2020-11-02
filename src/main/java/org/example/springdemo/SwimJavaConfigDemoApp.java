package org.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

//        call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

//        call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

//        close the context
        context.close();

    }
}
