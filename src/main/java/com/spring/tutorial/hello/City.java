package com.spring.tutorial.hello;

public class City {
    private String name;
    private int population;
    private double budget;

    @Override
    public String toString() {
        return this.name + "|" + this.population + "|" + this.budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
