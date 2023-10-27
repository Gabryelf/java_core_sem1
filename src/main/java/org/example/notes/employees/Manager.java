package org.example.notes.employees;

/**
 * Класс наследник суперкласса Сотрудников. Предназначен для обособленности видов сотрудников и удобной
 * работы с классом родителем и другими наследниками.
 *
 * @author Валеев Сергей
 */
class Manager extends Employee {
    public Manager(String name,int year, int month, int day, double salary) {
        super(name,year, month, day, salary);
    }

    public static void raiseSalary(Employee[] employees, double percentage) {
        for (Employee employee : employees) {
            if (!(employee instanceof Manager)) {
                employee.raiseSalary(percentage);
            }
        }
    }
}

