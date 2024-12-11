# Java Multithreading Exercises

This document provides an overview of two exercises focused on multithreading in Java. The exercises demonstrate classic multithreading behaviors and parallel computation using threads.

---

## **Table of Contents**
1. [Exercise 1: Talkative Threads](#exercise-1-talkative-threads)
   - [Objective](#objective)
   - [Steps](#steps)
   - [Code](#code)
   - [Observation](#observation)
2. [Exercise 2: Parallel Array Summation](#exercise-2-parallel-array-summation)
   - [Objective](#objective-1)
   - [Steps](#steps-1)
   - [Code](#code-1)
   - [Output](#output)
3. [Notes](#notes)
---

## **Exercise 1: Talkative Threads**

### **Objective**
Create a multithreaded application to illustrate how multiple threads execute concurrently.

### **Steps**
1. **Create the `Talkative` class**:
   - Implement the `Runnable` interface.
   - Include a constructor that accepts an integer parameter and assigns it to a class attribute.

2. **Override the `run` method**:
   - Print the thread name and the parameter value 100 times.

3. **Implement the `Main` class**:
   - Instantiate 10 `Thread` objects, each initialized with a unique instance of `Talkative`.
   - Start all threads using the `start()` method.

### **Code**
   *Talkative Class*
```java
public class Talkative implements Runnable {
    private int Param;
    private String Name;

    public Talkative(int param, String name) {
        Name = name;
        Param = param;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Name + " " + Param);
        }
    }
}
```
*Main Class*
```java
public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Talkative(1, "thread1"));
        Thread th2 = new Thread(new Talkative(2, "thread2"));
        Thread th3 = new Thread(new Talkative(3, "thread3"));
        Thread th4 = new Thread(new Talkative(4, "thread4"));
        Thread th5 = new Thread(new Talkative(5, "thread5"));
        Thread th6 = new Thread(new Talkative(6, "thread6"));
        Thread th7 = new Thread(new Talkative(7, "thread7"));
        Thread th8 = new Thread(new Talkative(8, "thread8"));
        Thread th9 = new Thread(new Talkative(9, "thread9"));
        Thread th10 = new Thread(new Talkative(10, "thread10"));

        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
    }
}
```

### **Observation**
The output demonstrates concurrent execution of threads. The order of execution is not deterministic due to the nature of multithreading.

---

## **Exercise 2: Parallel Array Summation**

### **Objective**
Develop a program to compute the sum of an array using multiple threads to process different parts of the array concurrently.

### **Steps**
1. **Create the `Sommeur` class**:
   - Implement the `Runnable` interface.
   - Use a constructor to accept an array and index range (`debut` and `fin`) to process.
   - Override the `run` method to calculate the sum of the specified range.
   - Provide a static method `getSomme()` to retrieve the total sum.

2. **Implement the `Main` class**:
   - Divide the array into segments.
   - Create threads for each segment, passing the relevant range to instances of `Sommeur`.
   - Use `join()` to ensure all threads complete before displaying the final sum.

### **Code**
*Sommeur Class*
```java
public class Sommeur implements Runnable {
    int[] Tab;
    int Debut;
    int Fin;
    static int Somme;

    @Override
    public void run() {
        for (int i = Debut; i < Fin; i++) {
            Somme += Tab[i];
        }
    }

    public Sommeur(int[] tab, int debut, int fin) {
        Tab = tab;
        Debut = debut;
        Fin = fin;
    }

    public static int getSomme() {
        return Somme;
    }
}
```
*Main Class*
```java
public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] Tab = {1, 35, 89, 100, 55, 89, 35, 99, 47, 29, 64, 774, 1000};
        Thread th1 = new Thread(new Sommeur(Tab, 0, 5));
        Thread th2 = new Thread(new Sommeur(Tab, 6, 8));
        Thread th3 = new Thread(new Sommeur(Tab, 9, 12));

        th1.start();
        th2.start();
        th3.start();

        th1.join();
        th2.join();
        th3.join();

        System.out.println(Sommeur.getSomme());
    }
}
```

### **Output**
The program outputs the total sum of the array after all threads have completed execution.

---

### **Notes**
- The exercises demonstrate fundamental multithreading concepts, such as creating and managing threads, dividing tasks for concurrent processing, and synchronizing thread completion.
- Exercise 2 illustrates how to implement parallel computation efficiently using threads.
