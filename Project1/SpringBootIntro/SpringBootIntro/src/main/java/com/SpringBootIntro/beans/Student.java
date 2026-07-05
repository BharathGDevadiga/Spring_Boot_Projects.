package com.SpringBootIntro.beans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
    private int regno;
    private String name;

    private Address address;


    //    public void setRegno(int regno) {
//        this.regno = regno;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setAddress(Address address) {
//        this.address = address;
//    }


    public Student(int regno, String name, Address address) {
        this.regno = regno;
        this.name = name;
        this.address = address;
    }

    public void display(){
        System.out.println("RegNo:" +regno);
        System.out.println("Name:" +name);
        System.out.println("Address:" +address);
    }
}
