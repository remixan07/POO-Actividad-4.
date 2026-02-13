public class POO_Actividad_4 {

    public static void main(String[] args) {

        Subject subject1 = new Subject("Math", "M101", 7, 20);
        Subject subject2 = new Subject("Physics", "P202", 6, 15);
        Subject subject3 = new Subject("Programming", "PR303", 5, 18);

        Course course = new Course("Semester 1", subject1, subject2, subject3);

        Student student = new Student("ST12345", "Carlos", 19, course);

        Professor professor = new Professor("Dr. Smith", "N1234", 500, subject1);

        System.out.println("Total Credits: " + course.calculateTotalCredits());
        System.out.println("Weekly Salary: " + professor.calculateWeeklySalary());
    }
}

class Subject {

    private String name;
    private String code;
    private int credits;
    private int weeklyHours;

    public Subject(String name, String code, int credits, int weeklyHours) {
        this.name = name;
        this.code = code;
        this.credits = credits;
        this.weeklyHours = weeklyHours;
    }

    public Subject(Subject s) {
        this.name = s.name;
        this.code = s.code;
        this.credits = s.credits;
        this.weeklyHours = s.weeklyHours;
    }

    public int getCredits() { return credits; }
    public int getWeeklyHours() { return weeklyHours; }
}

class Course {

    private String name;
    private Subject subject1, subject2, subject3;

    public Course(String name, Subject subject1, Subject subject2, Subject subject3) {
        this.name = name;
        this.subject1 = new Subject(subject1);  // ✔ deep copy
        this.subject2 = new Subject(subject2);
        this.subject3 = new Subject(subject3);
    }

    public Course(Course c) {
        this.name = c.name;
        this.subject1 = new Subject(c.subject1);
        this.subject2 = new Subject(c.subject2);
        this.subject3 = new Subject(c.subject3);
    }

    public int calculateTotalCredits() {
        return subject1.getCredits() + subject2.getCredits() + subject3.getCredits();
    }
}

class Student {

    private String id;
    private String name;
    private int age;
    private Course course;

    public Student(String id, String name, int age, Course course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course; // ❌ still no deep copy
    }
}

class Professor {

    private String name;
    private String payrollNumber;
    private double salaryPerHour;
    private Subject subject;

    public Professor(String name, String payrollNumber, double salaryPerHour, Subject subject) {
        this.name = name;
        this.payrollNumber = payrollNumber;
        this.salaryPerHour = salaryPerHour;
        this.subject = subject; // ❌ no deep copy
    }

    public double calculateWeeklySalary() {
        return salaryPerHour * subject.getWeeklyHours();
    }
}
