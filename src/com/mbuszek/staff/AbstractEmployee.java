package com.mbuszek.staff;

import com.mbuszek.interfaces.DepartmentInterface;
import com.mbuszek.interfaces.EmployeeInterface;

public class AbstractEmployee implements EmployeeInterface{

    public AbstractEmployee() {
    }

    public AbstractEmployee(String name, int exp) {
        this.name = name;
        this.exp = exp;
    }

    private String name;
    private int exp;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getExp() {
        return exp;
    }

    @Override
    public DepartmentInterface getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(DepartmentInterface department) {

    }

    @Override
    public boolean isFree() {
        return free;
    }

    @Override
    public void getInfo() {

    }
}
