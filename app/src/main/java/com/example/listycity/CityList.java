package com.example.listycity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Determines if a specific city is in the list of cities
     * @param city
     * The city to check membership of within the list of cities
     * @return
     * Return a boolean representing if the city is in the list of cities
     */
    public boolean hasCity (City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list of cities.
     * @param city
     */
    public void deleteCity(City city) {
        if (!hasCity(city)) {
            throw new RuntimeException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list of cities.
     * @return
     * Returns the number of cities in the list of cities.
     */
    public int countCities() {
        return cities.size();
    }

}