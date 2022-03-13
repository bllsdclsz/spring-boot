package com.eko.ch;

public class GoodWorker implements Worker{
    private int cost = 40;
    private int workHour = 40;

    @Override
    public int calculateTotalAmountOfMoney(){
        return cost * workHour;
    }
}
