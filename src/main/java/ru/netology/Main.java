package ru.netology;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t Домашнее задание по теме: \"Поведенческие шаблоны. ... Iterator ...\"");
        for (int r : new Randoms(90, 100)) {
            System.out.println("Случайное число: " + r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}