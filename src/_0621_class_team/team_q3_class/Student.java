package _0621_class_team.team_q3_class;

public class Student {
    private String id;
    private String name;
    private int grade;
    private String department;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // getter 메서드
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }
}