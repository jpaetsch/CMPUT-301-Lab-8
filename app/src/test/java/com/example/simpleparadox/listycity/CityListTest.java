package com.example.simpleparadox.listycity;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CityListTest {

    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countCities());

        cityList.add(new City("Regina", "Saskatchewan"));

        assertEquals(2, cityList.countCities());
        assertTrue(cityList.hasCity(new City("Regina", "Saskatchewan")));
    }

    @Test
    void testCountDistinctProvinces() {
        CityList cityList = mockCityList();

        assertEquals(1, cityList.countProvinces());

        cityList.add(new City("Winnipeg", "Manitoba"));
        assertEquals(2, cityList.countProvinces());

        cityList.add(new City("Calgary", "Alberta"));
        assertEquals(2, cityList.countProvinces());
    }
}
