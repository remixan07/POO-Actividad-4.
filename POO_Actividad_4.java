import java.util.Scanner;

public class POO_Actividad_4 {

    public static void main(String[] args) {

        Subject s1 = new Subject("Math","M1",5,10);
        Subject s2 = new Subject("Physics","P1",6,8);
        Subject s3 = new Subject("Programming","PR1",7,12);

        Course c = new Course("Semester 1", s1, s2, s3);
        Student st = new Student("ID1","Carlos",19,c);
        Professor p = new Professor("Dr. Smith","N1",500,s1);

        System.out.println("Credits: " + c.calculateTotalCredits());
    }
}

class Subject {

    private String name;
    private String code;
    private int credits;
    private int weeklyHours;

    public Subject(String name,String code,int credits,int weeklyHours){
        this.name=name;
        this.code=code;
        this.credits=credits;
        this.weeklyHours=weeklyHours;
    }

    public int getCredits(){ return credits; }
    public int getWeeklyHours(){ return weeklyHours; }
}

class Course {

    private String name;
    private Subject s1,s2,s3;

    public Course(String name,Subject s1,Subject s2,Subject s3){
        this.name=name;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public int calculateTotalCredits(){
        return s1.getCredits()+s2.getCredits()+s3.getCredits();
    }
}

class Student {
    private String id;
    private String name;
    private int age;
    private Course course;

    public Student(String id,String name,int age,Course course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
}

class Professor {
    private String name;
    private String payroll;
    private double salaryPerHour;
    private Subject subject;

    public Professor(String name,String payroll,double salaryPerHour,Subject subject){
        this.name=name;
        this.payroll=payroll;
        this.salaryPerHour=salaryPerHour;
        this.subject=subject;
    }

    public double calculateWeeklySalary(){
        return salaryPerHour*10;
    }
}
