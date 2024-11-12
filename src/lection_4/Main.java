package lection_4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student stPavel = new Student("Павел", "ИС", 5);
        stPavel.addScore(5);
        stPavel.addScore(4);
        stPavel.addScore(3);
        stPavel.addScore(4);
        stPavel.getAtrStud();
        Student stDanil = new Student("Данил", "ИС", 4);
        stDanil.addScore(4);
        stDanil.addScore(2);
        stDanil.addScore(2);
        stDanil.addScore(3);
        stDanil.getAtrStud();
        List<Student> students = new ArrayList<Student>();//коллекция студентов
        students.add(stPavel);//добавляем студента
        students.add(stDanil);//добавляем студента
        AllStudent allsts = new AllStudent();//создаем класс для использования методов удаления и вывода
        students = allsts.delNeud(students);//удаляем студента с неуд. средним
        allsts.printStudents(students,6);//студент двоечник Данил его нет, на вывод Павел
    }
}