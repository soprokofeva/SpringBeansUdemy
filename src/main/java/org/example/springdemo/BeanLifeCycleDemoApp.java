package org.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

    public static void main(String[] args) {

//        load the sprint config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");

//        retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
