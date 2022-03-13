package com.eko.ch;

public class LazyWorker implements Worker{
    private int cost = 23;
    private int workHour = 20;

    @Override
    public int calculateTotalAmountOfMoney(){
        return cost * workHour;
    }
}
