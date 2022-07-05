package com.thilaka.array.a.solution;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        //numbers.removeAt(3);
        //System.out.println(numbers.indexOf(0));
        //System.out.println(numbers.indexOf(100));
        numbers.print();
        //numbers.removeAt(1);
        //numbers.print();
    }
}
