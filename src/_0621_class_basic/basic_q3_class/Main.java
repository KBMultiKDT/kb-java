class Student {
    String id;
    String name;
    int grade;
    String department;

    // 생성자를 사용하지 않습니다.
}

class Subject {
    String name;
    int score;

    // 생성자를 사용하지 않습니다.
}

class Course {
    String courseName;
    int maxStudents;
    Student[] students;
    int studentCount;
    Subject[] subjects;
    int subjectCount;

    // 모든 초기화를 외부에서 처리하도록 생성자를 제거했습니다.
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

    double getAverageScore() {
        int totalScore = 0;
        for (int i = 0; i < subjectCount; i++) {
            totalScore += subjects[i].score;
        }
        return subjectCount == 0 ? 0 : (double) totalScore / subjectCount;
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
        course.courseName = "Java Programming";
        course.maxStudents = 30;
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

        Subject subject = new Subject();
        subject.name = "Java";
        subject.score = 95;
        course.addSubject(subject);

        course.printCourseInfo();
        System.out.println("Average Score: " + course.getAverageScore());
    }
}
