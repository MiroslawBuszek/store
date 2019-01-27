package com.mbuszek.goods;

import com.mbuszek.department.AbstractDepartment;
import com.mbuszek.interfaces.DepartmentInterface;
import com.mbuszek.interfaces.FoodInterface;

public abstract class AbstractFood implements FoodInterface{
    private double price;
    private int expirationDay;
    private String name;
    private AbstractDepartment department;


    //конструкторы:
    public AbstractFood() {
    }

    public AbstractFood(String name) {
        this.name = name;
    }


    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int getExpirationDay() {
        return expirationDay;
    }

    public void setExpirationDay(int expirationDay) {
        this.expirationDay = expirationDay;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public DepartmentInterface getDepartmentInterface() {
        return null;
    }

    public void setDepartment(AbstractDepartment department) {
        this.department = department;
    }

    @Override
    public int decay(int day){ //отнимаем от срока годности количество дней
        return (this.getExpirationDay()-day);
    }
}
