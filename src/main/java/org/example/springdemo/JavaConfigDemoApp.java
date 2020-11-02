package org.example.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = context.getBean("tennisCoach", Coach.class);

//        call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

//        call method to get the daily fortune
        System.out.println(theCoach.getDailyFortune());

//        close the context
        context.close();

    }
}
