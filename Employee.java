package com.example.java8program.collection;


public class Employee {
    private String Id;
    private String Name;
    private String address;
    public String getId() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public String getAddress() {
        return address;
    }
    public void setId(String id) {
        Id = id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Employee [Id=" + Id + ", Name=" + Name + ", address=" + address + "]";
    }
    
}
