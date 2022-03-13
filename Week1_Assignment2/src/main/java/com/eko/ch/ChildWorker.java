package com.eko.ch;

public class ChildWorker implements Worker{
    private int cost = 10;
    private int workHour = 30;

    @Override
    public int calculateTotalAmountOfMoney(){
        return cost * workHour;
    }
}
