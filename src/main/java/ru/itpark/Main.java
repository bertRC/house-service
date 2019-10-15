package ru.itpark;

import ru.itpark.model.House;
import ru.itpark.service.HouseService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HouseService service = new HouseService();

        service.add(new House(
                1,
                "2-к квартира, 63 м², 5/24 эт.",
                "https://06.img.avito.st/640x480/6006342406.jpg",
                11_000_000,
                null,
                "Козья Слобода, 1,2 км, Республика Татарстан, Казань, Ново-Савиновский район, Меридианная улица, 2"));
        service.add(new House(
                2,
                "1-к квартира, 46 м², 6/9 эт.",
                "https://01.img.avito.st/640x480/5163598701.jpg",
                1_000,
                "за сутки",
                "Козья Слобода, 3,4 км, Республика Татарстан, Казань, улица Маршала Чуйкова, 63"));
        service.add(new House(
                3,
                "Комната 25 м² в 3-к, 2/2 эт.",
                "https://83.img.avito.st/640x480/6146122183.jpg",
                1_500,
                "за сутки",
                "Дубравная, 4,1 км, Республика Татарстан, Казань, жилой массив"));
        service.add(new House(
                4,
                "Коттедж 150.3 м² на участке 5 сот.",
                "https://39.img.avito.st/640x480/6131885939.jpg",
                5_900_000,
                null,
                "Оренбургский тракт, 15 км, Столбище, Советская"));
        service.add(new House(
                5,
                "Коттедж 175 м² на участке 15 сот.",
                "https://24.img.avito.st/640x480/5581959624.jpg",
                4_000,
                "за сутки",
                "Мамадышский тракт, Республика Татарстан, Казань, жилой массив Вознесенское, Дубравная улица, 14"));

        {
            System.out.println("--- Поиск по району ---");
            List<House> results = service.search("ново-сав");
            for (House result : results) {
                System.out.println(result);
            }
        }
        {
            System.out.println("--- Поиск по диапазону цен ---");
            List<House> results = service.search(3_000, 6_000_000);
            for (House result : results) {
                System.out.println(result);
            }
        }
        {
            System.out.println("--- Поиск объявлений, в которых сдают квартиру/дом ---");
            List<House> results = service.searchToRent(0, 0, "коттедж");
            for (House result : results) {
                System.out.println(result);
            }
        }
    }
}
