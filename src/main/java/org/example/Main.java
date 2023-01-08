package org.example;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Привет! \nВведите размер списка:");
        int size = in.nextInt();
        System.out.print("Введите верхнюю границу значений элементов в списке:");
        int maxSize = in.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new Random().ints(size, 0, maxSize).boxed().collect(Collectors.toList());
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра:");
        int treshold = in.nextInt();
        Filter filter = new Filter(treshold);
        List<Integer> filterList = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список:" + filterList);
        logger.log("Завершаем программу");
    }
}