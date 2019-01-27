package com.mbuszek.interfaces;


public interface VisitorInterface {

    void buy(FoodInterface foods);

    void returnGoods(FoodInterface foods);

    String getName();
}
