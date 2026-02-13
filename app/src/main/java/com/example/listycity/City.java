package com.example.listycity;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable {
    private String city;
    private String province;

    /**
     * Constructs a new City with the specified name and province.
     *
     * @param city the name of the city
     * @param province the province the city belongs to
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the name of the city.
     *
     * @return the city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province the city belongs to.
     *
     * @return the province name
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * Compares this city with another city for order.
     *
     * @param o the city to compare to
     * @return a negative integer, zero, or a positive integer
     *         as this city name is less than, equal to, or greater than the specified city name
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o;
        return this.city.compareTo(city.getCityName()); // this.city refers to the city name
    }
}