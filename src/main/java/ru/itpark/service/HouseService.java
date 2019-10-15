package ru.itpark.service;

import ru.itpark.model.House;

import java.util.ArrayList;
import java.util.List;

public class HouseService {
    private List<House> houses;

    public HouseService() {
        houses = new ArrayList<>();
    }

    public List<House> getHouses() {
        return houses;
    }

    public void setHouses(List<House> houses) {
        this.houses = houses;
    }

    public void add(House house) {
        houses.add(house);
    }

    public List<House> search(int minPrice, int maxPrice, String address, boolean isToBuy, boolean isToRent) {
        List<House> results = new ArrayList<>();
        for (House house : houses) {
            boolean suitableForBuyRent = isToBuy && house.getPayPeriod() == null || isToRent && house.getPayPeriod() != null;
            boolean suitableForMinPrice = house.getPrice() >= minPrice;
            boolean suitableForMaxPrice = house.getPrice() <= maxPrice || maxPrice == 0;
            boolean suitableForAddress = house.getAddress().toLowerCase().contains(address.toLowerCase());
            if (suitableForBuyRent & suitableForMinPrice & suitableForMaxPrice & suitableForAddress) {
                results.add(house);
            }
        }
        return results;
    }
}

