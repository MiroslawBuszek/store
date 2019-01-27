package com.mbuszek.interfaces;


public interface EmployeeInterface {

    String getName();

    int getExp();

    DepartmentInterface getDepartment();

    void setDepartment(DepartmentInterface department);

    boolean isFree();

    void getInfo();
}
