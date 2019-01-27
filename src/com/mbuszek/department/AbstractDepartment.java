package com.mbuszek.department;

import com.mbuszek.interfaces.DepartmentInterface;
import com.mbuszek.interfaces.EmployeeInterface;
import com.mbuszek.interfaces.FoodInterface;

import java.util.ArrayList;

public class AbstractDepartment implements DepartmentInterface{

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<FoodInterface> foodList;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<FoodInterface> getGoodsList() {
        return foodList;
    }

    public void setFoodList(ArrayList<FoodInterface> foodList) {
        this.foodList = foodList;
    }

}
