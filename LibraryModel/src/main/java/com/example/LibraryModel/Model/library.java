package com.example.LibraryModel.Model;

import java.util.Arrays;

public class library {
    //library name,  library address , library number ,library facilities )
    private String name;
    private String address;
    private long number;
    private String[] facilities;

    public library(String name, String address, long number, String[] facilities) {
        this.name = name;
        this.address = address;
        this.number = number;
        this.facilities = facilities;
    }

    public library() {
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }

    @Override
    public String toString() {
        return "library{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", facilities=" + Arrays.toString(facilities) +
                '}';
    }
}
