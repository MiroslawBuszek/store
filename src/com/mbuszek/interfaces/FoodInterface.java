package com.mbuszek.interfaces;


public interface FoodInterface {

    int getExpirationDay();

    double getPrice();

    String getName();

    DepartmentInterface getDepartmentInterface();

    int decay(int day);
}
