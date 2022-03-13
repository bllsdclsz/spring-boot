package com.eko.ch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Application {
  public static void main(String[] args) {
    Random random = new Random();
    List<Worker> workerList = new ArrayList<>();

    for (int index = 0; index < random.nextInt(7) + 2; index++) {
      int workerNumber = random.nextInt(4);
      switch (workerNumber) {
        case 0 -> workerList.add(new DisabledWorker());
        case 1 -> workerList.add(new ChildWorker());
        case 2 -> workerList.add(new LazyWorker());
        default -> workerList.add(new GoodWorker());
      }
    }

    int totalAmount = workerList.stream()
            .map(Worker::calculateTotalAmountOfMoney)
            .collect(Collectors.summingInt(Integer::intValue));

    System.out.println(totalAmount);
  }
}
