package com.spring.tutorial.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final ApplicationContext appContext = new ClassPathXmlApplicationContext("com.spring.tutorial.hello/Cities.xml");
        final Map<String, City> cities = appContext.getBeansOfType(City.class);

        System.out.println("City|Population|Budget");
        System.out.println("======================");
        cities.forEach((id, city) -> System.out.println(city));
    }
}
