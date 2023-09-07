/*
*1. Построить три класса (базовый и 2 потомка), описывающих некоторых работников с почасовой оплатой
* (один из потомков - Freelancer) и фиксированной оплатой (второй потомок -Worker).
а) Описать в базовом классе абстрактный метод для расчёта среднемесячной заработной платы.
Для «повременщиков» формула для расчета такова:
* «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка», для работников с
* фиксированной оплатой «среднемесячная заработная плата = фиксированная месячная оплата».
б) Создать на базе абстрактного класса массив/коллекцию сотрудников и заполнить его.
в) ** Реализовать интерфейсы для возможности сортировки массива/коллекции (обратите ваше внимание
* на интерфейсы Comparator, Comparable), добавьте новое состояние на урове базового типа и создайте
* свой уникальный компаратор.
г) ** Создать класс, содержащий массив или коллекцию сотрудников (как Worker так и Freelancer), и
* реализовать возможность вывода данных с использованием foreach (подсказка: вам потребуется поработать
* с интерфейсом Iterable).
 */
package ru.gb;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Employee> setEmployee = new TreeSet<>();

        setEmployee.add(new Freelancer("Ivan", "Ivanov", 800.0));
        setEmployee.add(new Freelancer("Alexey", "Sovrasov", 1_600.0));
        setEmployee.add(new Worker("Ignat", "Klementyev", 90_000.0));
        setEmployee.add(new Worker("Artur", "Gasparyan", 110_000.0));

        CollectionEmployee<Employee> colEmployee = new CollectionEmployee<Employee>(new Employee[]{
                new Freelancer("Andrey", "Rublew", 1_000.0),
                new Freelancer("Stanislav", "Shishkin", 1_500.0),
                new Worker("Boris", "Britva", 100_000.0),
                new Worker("Tony", "Bulletinteeth", 150_000.0)});

        for (Employee itemSet: setEmployee) {
            System.out.println(itemSet);
        }
        System.out.println();
        for (Employee itemCol: colEmployee) {
            System.out.println(itemCol);
        }

    }
}