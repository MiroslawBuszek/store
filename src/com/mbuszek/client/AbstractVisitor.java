package com.mbuszek.client;

import com.mbuszek.interfaces.FoodInterface;
import com.mbuszek.interfaces.VisitorInterface;

public class AbstractVisitor implements VisitorInterface {

    private String name;

    @Override
    public void buy(FoodInterface foods) {
        System.out.println(foods.getName());
    }

    @Override
    public void returnGoods(FoodInterface foods) {

    }

    @Override
    public String getName() {
        return name;
    }
}