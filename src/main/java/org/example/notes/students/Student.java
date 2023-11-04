package org.example.notes.students;

import java.util.List;
/**
 * Класс предназначен для хранения структуры списка данных в базе.
 * Предполагает наличие имени, имеющиеся оценки, предметная область изучения и
 * метод определения средней оценки.
 *
 * @author Валеев Сергей
 */

class Student {
    private String name;
    private List<Integer> grades;
    private double averageGrade;
    private String major;

    public Student(String name, List<Integer> grades, String major) {
        this.name = name;
        this.grades = grades;
        calculateAverageGrade();
        this.major = major;
    }

    private void calculateAverageGrade() {
        averageGrade = grades.stream().mapToInt(Integer::intValue).average().getAsDouble();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Студенты найдены :" +'\''+
                "имя'" + name + '\'' +
                ", оценки :" + grades +
                ", средний бал по специальности :" + averageGrade +
                ", специальность '" + major + '\'' +
                '}';
    }
}
