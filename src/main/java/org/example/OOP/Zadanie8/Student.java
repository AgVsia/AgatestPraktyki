package org.example.OOP.Zadanie8;

public class Student {
    private String firstName;
    private String lastName;
    private int studentIndex;
    private int yearOfStudy;
    private String[] subjects;
    private int numSubjects;

    public Student(String firstName, String lastName, int studentIndex, int yearOfStudy, String[] subjects) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentIndex = studentIndex;
        this.yearOfStudy = yearOfStudy;
        this.subjects = subjects;
        this.numSubjects = subjects.length;
    }

    public Student(String firstName, String lastName, int studentIndex, int yearOfStudy) {
        this(firstName, lastName, studentIndex, yearOfStudy, new String[]{"Programowanie obiektowe"});
    }

    public void displayData() {
        System.out.print("(" + firstName + " " + lastName + ", " + studentIndex + ", year " + yearOfStudy + ", ");
        for (int i = 0; i < numSubjects; i++) {
            if (i != numSubjects - 1) {
                System.out.print(subjects[i] + ", ");
            } else {
                System.out.println(subjects[i] + ")");
            }
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getStudentIndex() {
        return studentIndex;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void increaseYearOfStudy() {
        yearOfStudy++;
    }

    public void addSubject(String subject) {
        if (numSubjects < subjects.length) {
            subjects[numSubjects] = subject;
            numSubjects++;
        }
    }
}
