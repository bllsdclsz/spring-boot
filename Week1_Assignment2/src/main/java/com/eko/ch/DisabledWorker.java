package com.eko.ch;

public class DisabledWorker implements Worker{
    private int cost = 10;
    private int workHour = 10;

    @Override
    public int calculateTotalAmountOfMoney(){
        return cost * workHour;
    }
}
