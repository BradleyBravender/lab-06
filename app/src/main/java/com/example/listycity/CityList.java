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
     * Checks whether a given city is present in the list.
     *
     * @param city The city to check
     * @return True if the city exists in the list, false otherwise
     */
    public boolean hasCity (City city) {
        return cities.contains(city);
    }

    /**
     * Removes a city from the list of cities.
     *
     * @param city the city to remove
     * @throws RuntimeException if the city does not exist in the list
     */
    public void deleteCity(City city) {
        if (!hasCity(city)) {
            throw new RuntimeException();
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     *
     * @return the number of cities currently stored in this list
     */
    public int countCities() {
        return cities.size();
    }

}