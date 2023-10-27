package org.example.notes.employees;

/**
 * Класс для входа в программу. Программа отдает данные о составе сотрудников и их
 * зароботной плате, также обладает методом увеличения в процентах зароботной платы всех
 * сотрудников с исключениемна управленцев.
 * Программа может автоматически сравнить дату рождения одного сотрудника и другого, и
 * вывести результат пользователю.
 *
 * @author Валеев Сергей
 */
import static org.example.notes.employees.Employee.dateComparator;

public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("Lola",2022, 6, 1, 5000);
        Employee employee1 = new Employee("Alex",2021, 1, 10, 3000);
        Employee employee2 = new Employee("Vlad",2021, 2, 14, 3500);

        int result = dateComparator.compare(employee1, employee2);
        if (result < 0)
        {
            System.out.println( employee1.getName() + " \nродился/родилась раньше, чем \n" + employee2.getName() );
        }
        else if (result > 0)
        {
            System.out.println( employee1.getName() + " \nродился/родилась позже, чем \n" + employee2.getName() );
        }
        else
        {
            System.out.println( employee1.getName() + " \nи " + employee2.getName() + " \nродились в один день\n" );
        }
            Employee[] employees = {manager, employee1, employee2};

        System.out.println("\nзарплата штата до повышения:");
        for (Employee employee : employees) {
            System.out.println("Заработная плата: " + employee.getSalary());
        }

        Manager.raiseSalary(employees, 10);

        System.out.println("\nзарплата штата после повышения:");
        for (Employee employee : employees) {
            System.out.println("Заработная плата: " + employee.getSalary());
        }
    }
}
