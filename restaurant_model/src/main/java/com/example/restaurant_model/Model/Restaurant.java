package com.example.restaurant_model.Model;

public class Restaurant {

    private int sno;
    private String name;
    private String  address;
    private int number;
    private String speciality;
    private int totalStaff;
    private int rating;

    public Restaurant(){}

    public Restaurant(int sno,String name, String address, int number, String speciality, int totalStaff, int rating) {
        this.sno=sno;
        this.name = name;
        this.address = address;
        this.number = number;
        this.speciality = speciality;
        this.totalStaff = totalStaff;
        this.rating = rating;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "sno=" + sno +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", speciality='" + speciality + '\'' +
                ", totalStaff=" + totalStaff +
                ", rating=" + rating +
                '}';
    }
}
