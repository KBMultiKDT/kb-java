class Student {
    String id;
    String name;
    int grade;
    String department;
}

class Subject {
    String name;
    int score;
}

class Course {
    String courseName;
    int maxStudents;
    Student[] students;
    int studentCount;
    Subject[] subjects;
    int subjectCount;

    void addStudent(Student student) {
        if (studentCount < maxStudents) {
            students[studentCount++] = student;
        }
    }

    void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) { // 객체 비교를 위해 equals 대신 == 사용
                System.arraycopy(students, i + 1, students, i, studentCount - i - 1);
                students[--studentCount] = null;
                break;
            }
        }
    }

    void addSubject(Subject subject) {
        if (subjectCount < maxStudents) {
            subjects[subjectCount++] = subject;
        }
    }

    void removeSubject(Subject subject) {
        for (int i = 0; i < subjectCount; i++) {
            if (subjects[i] == subject) {
                System.arraycopy(subjects, i + 1, subjects, i, subjectCount - i - 1);
                subjects[--subjectCount] = null;
                break;
            }
        }
    }

    void printCourseInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Max Students: " + maxStudents);
        System.out.println("Current Students: " + studentCount);
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Student: " + students[i].name + " - " + students[i].department);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course course = new Course();
        course.courseName = "Programming";
        course.maxStudents = 5;
        course.students = new Student[course.maxStudents];
        course.subjects = new Subject[course.maxStudents];
        course.studentCount = 0;
        course.subjectCount = 0;

        Student student = new Student();
        student.id = "2022001";
        student.name = "Kim";
        student.grade = 1;
        student.department = "Computer Science";
        course.addStudent(student);

        Student student2 = new Student();
        student2.id = "2022002";
        student2.name = "Park";
        student2.grade = 2;
        student2.department = "Computer Science";
        course.addStudent(student2);

        Subject subject = new Subject();
        subject.name = "Java";
        subject.score = 100; //만점
        course.addSubject(subject);

        Subject subject2 = new Subject();
        subject2.name = "Python";
        subject2.score = 100; //만점
        course.addSubject(subject2);

        course.printCourseInfo();
    }
}
