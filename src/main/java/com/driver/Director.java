package com.driver;

public class Director {
    private String name;
    private int numberOfMovies;
    private double rating;

    public Director() {
    }

    public Director(String name, int numberOfMovies, double rating) {
        this.name = name;
        this.numberOfMovies = numberOfMovies;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
