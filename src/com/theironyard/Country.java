package com.theironyard;

import static com.theironyard.Main.countryMap;

/**
 * Created by austin hays on 5/26/16.
 */
public class Country {
    String countries;
    String country;

    public void chooseLetter() throws Exception {
        System.out.println("Please choose a letter to see the countries associated with it.");
        if (countryMap.containsKey("letter")) {
            System.out.println("Here is/are your result(s): " + countryMap.get(countries));
        }
    }

    public String getCountries() {
        return countries;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countries='" + countries + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
