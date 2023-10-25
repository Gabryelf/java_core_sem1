package org.example.notes.proto_comparator;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Программа предназначена для сравнения дат.
 *
 * Вывод -1 означает меньшенство первой даты.
 * Вывод 0 означает равенство двух дат.
 * Вывод 1 означает большенство первой даты.
 *
 * @author Валеев Сергей
 */

public class DateComparator {

    public static void main(String[] args) {
        /**
         * Главный метод
         *
         * @param param программа пользует методы и подпрограммы описанные ниже.
         */


        PrintHello();
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введите первую дату 'гггг-мм-дд' :" );
        String input1 = scanner.nextLine();
        System.out.println( "Введите вторую дату 'гггг-мм-дд' :" );
        String input2 = scanner.nextLine();
        scanner.close();


        DateComparator dateComparator = new DateComparator();

        Date d1 = dateComparator.parseDate( input1 );
        Date d2 = dateComparator.parseDate( input2 );
        System.out.println( "Сравнение дат: " + dateComparator.compareDates( d1, d2 ) );

    }


    private Date parseDate(String date) {
        /**
         * Метод предназначен для обработки строкового значения ввода.
         *
         * @param param Принимает строку и парсит ее в соответствии с форматом ввода.
         * @return
         */
        try {
            String[] dateParts = date.split("-");
            int year = Integer.parseInt(dateParts[0]);
            int month = Integer.parseInt(dateParts[1]);
            int day = Integer.parseInt(dateParts[2]);
            Calendar cal = Calendar.getInstance();
            cal.set(year, month - 1, day);
            return cal.getTime();
        }catch (Exception e){
            System.out.println("Неправильный формат ввода. Попробуйте еще раз используя формат  'гггг-мм-дд' :");
        }

        return null;
    }


    private int compareDates(Date d1, Date d2) {
        /**
         * Метод предназначен для сравнения значений.
         *
         * @param param
         * @return
         */
        if (d1.before(d2)) {
            return -1;
        } else if (d1.equals(d2)) {
            return 0;
        } else {
            return +1;
        }
    }


    public static void PrintHello(){
        /**
         * Метод предназначен для оповещения пользователя.
         *
         * @param param
         * @return
         */
        System.out.println("Приветствую! Для сравнения дат введите их ниже по очереди.");
        System.out.println("Пожалуйста, придерживайтесь рекомендуемого формата ввода.");
    }


}



