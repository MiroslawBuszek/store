package com.mbuszek;

import com.mbuszek.client.CommonVisitor;
import com.mbuszek.goods.Apricot;
import com.mbuszek.goods.Cherry;
import com.mbuszek.interfaces.FoodInterface;

public class Main {

    public static void main(String[] args) {

        System.out.println("Your purchases:");
        FoodInterface apricot = new Apricot("Midle east");
        FoodInterface cherry = new Cherry("Eagle-Eye");
        FoodInterface cherry1 = new Cherry("Little");

        CommonVisitor visitor = new CommonVisitor();
        visitor.buy(cherry);
        visitor.buy(apricot);
        visitor.buy(cherry1);
    }
}
