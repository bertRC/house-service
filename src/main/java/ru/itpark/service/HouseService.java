package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private List<House> houses = new ArrayList<>();

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public void add(House house) {
        houses.add(house);
    }

    public List<House> search(int minPrice, int maxPrice) {
        return search(minPrice, maxPrice, "");
    }

    public List<House> search(String address) {
        return search(0, 0, address);
    }

    private List<House> search(int minPrice, int maxPrice, String address) {
        List<House> results = new ArrayList<>();
        for (House house : houses) {
            boolean suitableForMinPrice = house.getPrice() >= minPrice;
            boolean suitableForMaxPrice = house.getPrice() <= maxPrice || maxPrice == 0;
            boolean suitableForAddress = house.getAddress().toLowerCase().contains(address.toLowerCase()) || house.getTitle().toLowerCase().contains(address.toLowerCase());
            if (suitableForMinPrice & suitableForMaxPrice & suitableForAddress) {
                results.add(house);
            }
        }
        return results;
    }
}

