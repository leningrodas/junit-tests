import java.util.ArrayList;

public class Student {

    public static long id;
    public static String name;
    public ArrayList<Integer> grades;


    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public static long getId() {
        return id;
    }

    public static String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for(int grade: this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }




}
