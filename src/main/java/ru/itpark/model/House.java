package ru.itpark.model;

public class House {
    private int id;
    private String title;
    private String photoUrl;
    private int price;
    private String payPeriod;
    private String address;

    public House(int id, String title, String photoUrl, int price, String payPeriod, String address) {
        this.id = id;
        this.title = title;
        this.photoUrl = photoUrl;
        this.price = price;
        this.payPeriod = payPeriod;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPayPeriod() {
        return payPeriod;
    }

    public void setPayPeriod(String payPeriod) {
        this.payPeriod = payPeriod;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
