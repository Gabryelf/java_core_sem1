package org.example.notes.employees;

import java.util.Comparator;
/**
 * Суперкласс для сотрудников в котором лежит инициализация и методы работы с классами наследниками.
 *
 * @author Валеев Сергей
 */
class Employee {
    private String name;
    private int year;
    private int month;
    private int day;
    private double salary;

    public Employee(String name, int year, int month, int day, double salary) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.salary = salary;
    }
    /*public static Comparator<Employee> dateComparator = (e1, e2) -> {
        if (e1.year != e2.year) {
            return Integer.compare(e1.year, e2.year);
        } else if (e1.month != e2.month) {
            return Integer.compare(e1.month, e2.month);
        } else {
            return Integer.compare(e1.day, e2.day);
        }
    };*/
    /**
     * Метод предназначен для сравнения дат(новый - старый делал тоже но с условными операторами)
     * @param param принимает массив родительского класса и сравнивает между собой его элементы
     * @return возвращает отрицательное значение если первая дата меньше второй.
     * возвращает нолевое значение если первая и вторая даты равны.
     * возвращает положительное значение если первая дата больше второй.
     */
    public static Comparator<Employee> dateComparator = (e1, e2) ->
            Integer.compare(e1.year, e2.year) != 0 ?
                    Integer.compare(e1.year, e2.year) :
                    Integer.compare(e1.month, e2.month) != 0 ?
                            Integer.compare(e1.month, e2.month) :
                            Integer.compare(e1.day, e2.day);

    public void raiseSalary(double percentage) {
        this.salary += (this.salary * percentage) / 100;
    }

    public double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
