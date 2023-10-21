package org.example.notes.arraywork;

import java.util.Arrays;

/**
 * Класс предназначен для входа в программу работы с массивами
 * семинар 2 домашняя работа
 * @author Валеев Сергей
 *
 * задание:
 *
 * 1. Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3
 * countEvens([2, 2, 0]) → 3
 * countEvens([1, 3, 5]) → 0
 *
 * 2. Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
 * переданного не пустого массива.
 *
 * 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента,
 * с нулевым значением.
 */

public class Main {
    public static void main(String[] args) {
        /**
         * Метод предназначен для инициализации массивов
         *
         * @param param преведены статические массивы
         * @return метод отдает программе входные данные типа array
         */
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};            //1 задача инициализация
        int[] arr3 = {1, 3, 5};

        int[] array1 = { 1, 4, 9, 21, 7, 2 };
        int difference1 = findMaxMinDifference(array1);
                                                                 // 2 задача инициализация
        int[] array2 = { 6, 12, 8, 32, 7 };
        int difference2 = findMaxMinDifference(array2);

        int[] array3 = {0, 1, 0, -1, 0};
        int[] array4 = {0, 0, 1, -1, 0};              // 3 задача инициализация

        // вывод 1 задачи
        System.out.println("Количество четных элементов в массиве arr1: " + getEvenElementsCount(arr1));
        System.out.println("Количество четных элементов в массиве arr2: " + getEvenElementsCount(arr2));
        System.out.println("Количество четных элементов в массиве arr3: " + getEvenElementsCount(arr3));
        // вывод 2 задачи
        System.out.printf("Разница между максимальным и минимальным элементами массива %s равна %d.%n",
                Arrays.toString(array1), difference1);
        System.out.printf("Разница между максимальным и минимальным элементами массива %s равна %d.%n",
                Arrays.toString(array2), difference2);
        // вывод 3 задачи
        System.out.println(hasTwoAdjacentZeroes(array3) ? "Есть два соседних нуля" : "Нет двух соседних нулей");
        System.out.println(hasTwoAdjacentZeroes(array4) ? "Есть два соседних нуля" : "Нет двух соседних нулей");
    }

    /**
     * Метод предназначен для нахождения в заданном массиве количества четных элементов
     *
     * @return метод принимает массив и отдает переменную с искомым количеством четных элементов
     */
    static int getEvenElementsCount(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Метод предназначен для нахождения в заданном массиве разницы между минимальным и максимальным
     * по значению элементов.
     *
     * @return метод принимает массив и отдает результат вычитания минимального значения из максимального.
     */
    private static int findMaxMinDifference(int[] array) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for ( int x : array ) {
            max = Math.max( max, x );
            min = Math.min( min, x );
        }
        return max - min;
    }

    /**
     * Метод предназначен для проверки массива на наличие рядом стоящих, двух, нулевых элементов.
     *
     * @return метод принимает массив и отдает переменную типа boolean, которая показывает имеется ли
     * наличие нужных по условию задачи элементов.
     */
    static boolean hasTwoAdjacentZeroes(int[] arr){
        if(arr.length < 2) return false;

        for(int i = 1; i < arr.length; ++i){
            if(arr[i - 1] == 0 && arr[i] == 0){
                return true;
            }
        }

        return false;
    }

    // спасибо за ваше время!

}
