import java.util.Scanner;

public class POO_Actividad_4 {

    public static void main(String[] args) {

        Subject subject1 = new Subject("Math", "M101", 7, 20);
        Subject subject2 = new Subject("Physics", "P202", 6, 15);
        Subject subject3 = new Subject("Programming", "PR303", 5, 18);

        Course course = new Course("Semester 1", subject1, subject2, subject3);

        Student student = new Student("ST12345", "Carlos", 19, course);

        Professor professor = new Professor("Dr. Smith", "N1234", 500, subject1);

        System.out.println("===== COURSE DATA =====");
        System.out.println("Name: " + course.getName());
        System.out.println("Total Credits: " + course.calculateTotalCredits());

        System.out.println("\n===== STUDENT DATA =====");
        System.out.println("ID: " + student.getId());
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        System.out.println("\n===== PROFESSOR DATA =====");
        System.out.println("Payroll: " + professor.getPayrollNumber());
        System.out.println("Name: " + professor.getName());
        System.out.println("Weekly Salary: " + professor.calculateWeeklySalary());
    }
}

class Subject {

    private String name;
    private String code;
    private int credits;
    private int weeklyHours;

    public Subject() {}

    public Subject(String name,String code,int credits,int weeklyHours){
        this.name=name;
        this.code=code;
        this.credits=credits;
        this.weeklyHours=weeklyHours;
    }

    public Subject(Subject s){
        this.name=s.name;
        this.code=s.code;
        this.credits=s.credits;
        this.weeklyHours=s.weeklyHours;
    }

    public String getName(){ return name; }
    public int getCredits(){ return credits; }
    public int getWeeklyHours(){ return weeklyHours; }
}

class Course {

    private String name;
    private Subject s1,s2,s3;

    public Course(){}

    public Course(String name,Subject s1,Subject s2,Subject s3){
        this.name=name;
        this.s1=new Subject(s1);
        this.s2=new Subject(s2);
        this.s3=new Subject(s3);
    }

    public Course(Course c){
        this.name=c.name;
        this.s1=new Subject(c.s1);
        this.s2=new Subject(c.s2);
        this.s3=new Subject(c.s3);
    }

    public String getName(){ return name; }

    public int calculateTotalCredits(){
        return s1.getCredits()+s2.getCredits()+s3.getCredits();
    }
}

class Student {

    private String id;
    private String name;
    private int age;
    private Course course;

    public Student(){}

    public Student(String id,String name,int age,Course course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=new Course(course);
    }

    public Student(Student s){
        this.id=s.id;
        this.name=s.name;
        this.age=s.age;
        this.course=new Course(s.course);
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public int getAge(){ return age; }
}

class Professor {

    private String name;
    private String payrollNumber;
    private double salaryPerHour;
    private Subject subject;

    public Professor(){}

    public Professor(String name,String payrollNumber,double salaryPerHour,Subject subject){
        this.name=name;
        this.payrollNumber=payrollNumber;
        this.salaryPerHour=salaryPerHour;
        this.subject=new Subject(subject);
    }

    public Professor(Professor p){
        this.name=p.name;
        this.payrollNumber=p.payrollNumber;
        this.salaryPerHour=p.salaryPerHour;
        this.subject=new Subject(p.subject);
    }

    public String getName(){ return name; }
    public String getPayrollNumber(){ return payrollNumber; }

    public double calculateWeeklySalary(){
        return salaryPerHour*subject.getWeeklyHours();
    }
}
