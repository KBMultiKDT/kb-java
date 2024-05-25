package _0621_class_team.team_q3_class;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private int maxStudents;
    private int currentStudents;
    private List<Student> students;
    public static List<Subject> subjects;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
        this.currentStudents = 0;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    // 강좌에 학생 추가
    public void addStudent(Student student) {
        if (currentStudents < maxStudents) {
            students.add(student);
            currentStudents++;
        } else {
            System.out.println("최대 수강 인원을 초과하여 학생을 추가할 수 없습니다.");
        }
}

// 강좌에 과목 추가
public void addSubject(Subject subject) {
    subjects.add(subject);
}

// 학생 목록 출력
public void printStudents() {
    for (Student student : students) {
        System.out.println(student.getName());
    }
}

// 과목 목록 출력
public void printSubjects() {
    System.out.println(subjects);
    for (Subject subject : subjects) {
        System.out.println(subject.getName());
    }
}

// 강좌 정보 출력
public void printCourseInfo() {
    System.out.println("강좌명: " + courseName);
    System.out.println("수강 인원: " + currentStudents + "/" + maxStudents);
    System.out.println("수강 학생 목록:");
    printStudents();
    System.out.println("과목 목록:");
    printSubjects();
}
}
