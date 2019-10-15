package ru.itpark.service;

import ru.itpark.model.House;

import java.util.List;

public class HouseService {
    private List<House> houses;

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }
}

