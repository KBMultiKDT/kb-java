package _0620_class_deep.deep_q2_class;

public class Main {
    public static void main(String[] args) {
        // 강좌 생성
        Course course = new Course("자바 프로그래밍", 30);
        String[] subjectList = {"자바 기초", "jsp", "python", "spring", "웹 기본"};
        // 학생과 과목 추가
        Subject subject1 = null;
        Student student1 = null;
        for (int i = 0; i < 5; i++) {
            student1 = new Student();
            student1.setName("홍길동" + i);
            course.addStudent(student1);

            subject1 = new Subject();
            subject1.setName(subjectList[i]);
            course.addSubject(subject1);
            //System.out.println(Course.subjects.size());
        }


        // 강좌 정보 출력
        System.out.println("--------------");
        course.printCourseInfo();
    }
}
