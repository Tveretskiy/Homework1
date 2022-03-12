package com.DZ4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Run {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("11 Коваленко"));
        students.add(new Student("3 Попов"));
        students.add(new Student("2 Виноградова"));
        students.add(new Student("9 Прокофьев"));
        students.add(new Student("10 Мусоргский"));
        students.add(new Student("2 Саркисян"));
        students.add(new Student("8 Коноплянникова"));
        students.add(new Student("1 Хомячилов"));
        students.add(new Student("2 Лоскутова"));
        students.add(new Student("5 Собина"));
        students.add(new Student("2 Аверкина "));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s.getStudent());
        }
    }
}
