package com.javalearn.supermarket.interfaces;

public interface SuperMarket {

    Merchandise[] getAllMerchandise();

    Merchandise[] getRandomMerchandiseOfCategory(Category category);

    void addEarnedMoney(double earnedMoney);

    void dailyReport();

}
