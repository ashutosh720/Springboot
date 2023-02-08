package com.example.User_Management.Model;

public class UserManagement {

    private  int UserId;
    private String Name;

    private String userName;

    private String address;
    private int phoneNumber;

    public UserManagement(){
    }

    public UserManagement(int UserId, String Name, String userName, String address, int phoneNumber) {
        this.UserId = UserId;
        this.Name = Name;
        this.userName = userName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void setUserId(int UserId) {
        this.UserId = UserId;
    }

    public int getUserId() {
        return UserId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "UserMangement{" +
                "UserId='" + UserId + '\'' +
                ", Name='" + Name + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
