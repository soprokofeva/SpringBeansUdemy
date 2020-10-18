package org.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoAppProperties {
    public static void main(String[] args) {
        //        read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        get the bean from spring container
        Coach theCoach = context.getBean("swimCoach", Coach.class);

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
