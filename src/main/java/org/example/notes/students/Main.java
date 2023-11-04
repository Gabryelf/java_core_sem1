package org.example.notes.students;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.System.*;

/**
 * Класс предназначен для работы с данными о студентах.
 * Создана возможность с помощью метода(без использования циклов) сортировать, группировать и выводить
 * данные о имеющихся студентах в списках.
 *
 * @author Валеев Сергей
 */

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student( "Игорь", List.of( 5, 3, 5 ), "Информатика"),
                new Student( "Владимир", List.of( 3, 5 ), "Программирование"),
                new Student( "Жанна", List.of(4, 5, 5 ), "Информатика"),
                new Student( "Людмила", List.of( 4, 5 ), "Маркетинг"),
                new Student( "Алиса", List.of( 3, 5, 5 ), "Информатика"),
                new Student( "Владислав", List.of( 3, 5, 5 ), "Программирование"),
                new Student( "Руслан", List.of(4, 5, 5 ), "Информатика" ),
                new Student( "Шамиль", List.of(5, 5, 5 ), "Информатика" )
        );

        Comparator<Student> comparator = Comparator.comparing( Student::getAverageGrade ).reversed();
        Stream<Student> filteredStudents = students.stream()
                .filter( student -> student.getMajor().equals( "Информатика" ) )
                .filter( student -> student.getAverageGrade() > 4.5 )
                .sorted( comparator );

        out.println( "Первые пять студентов со средним баллом по специальности 'Информатика' : " );
        filteredStudents.limit(5).forEach(out::println);


    }
}
