package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
  public static Queue<String> createQueue() {
    return new LinkedList<>(Arrays.asList("Smith", "Montessori", "Peralta", "House"));
  }

  public static void printAndEmptyQueue(Queue<String> queue) {
    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }
  }

  public static void main(String[] args) {
    printAndEmptyQueue(new LinkedList<>(Arrays.asList("Smith", "Montessori", "Peralta", "House")));
  }
}
