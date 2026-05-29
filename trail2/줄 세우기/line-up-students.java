import java.util.Scanner;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int h;
    int w;
    int n;

    public Student(int h, int w, int n){
        this.h = h;
        this.w = w;
        this.n = n;
    }

    @Override
    public int compareTo(Student student){
        if(this.h == student.h){
            if(this.w == student.w){
                return this.n - student.n;
            }
            return student.w - this.w;
        }
        return student.h - this.h;
    }

    public String toString(){
        return h + " " + w + " " + n;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for(int i=0; i<n; i++){
            students[i] = new Student(sc.nextInt(), sc.nextInt(), i+1);
        }

        Arrays.sort(students);
        for(int i=0; i<n; i++){
            System.out.println(students[i]);
        }
    }
}