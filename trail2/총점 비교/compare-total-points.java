import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    String name;
    int kor;
    int eng;
    int math;

    public Student(String name, int kor, int eng, int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public int compareTo(Student student){
        return this.kor + this.eng + this.math - student.kor - student.eng - student.math;
    }

    public String toString(){
        return name + " " + kor +" "+eng+" "+math;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            students[i] = new Student(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        }

        Arrays.sort(students);

        for(int i=0; i<n; i++){
            System.out.println(students[i]);
        }
        
    }
}