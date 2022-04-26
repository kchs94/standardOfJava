package 정리.객체비교하기.Comparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Student[] arr = new Student[10];

        // 객체 초기화
        for (int i=0; i<10; i++) {
            arr[i] = new Student((int)(Math.random()*5),(int)(Math.random()*10));
        }

        // 정렬전
        System.out.println("정렬 전");
        for (int i=0; i<10; i++) {
            System.out.println(arr[i].age + " " + arr[i].grade);
        }
        System.out.println();

        Arrays.sort(arr);

        // 정렬 후
        System.out.println("정렬 후");
        for (int i=0; i<10; i++) {
            System.out.println(arr[i].age + " " + arr[i].grade);
        }
        System.out.println();
    }
}

class Student implements Comparable<Student> {

    int age;
    int grade;

    public Student(int age, int grade) {
        this.age = age;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {

        if (this.grade == o.grade)
            return this.age - o.age;

        return this.grade - o.grade;
    }   // 오름차순 기준, 음수면 교환 X
}